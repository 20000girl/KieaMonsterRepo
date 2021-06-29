package org.tain.tasks.asynccmd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.tain.data.WorkingData;
import org.tain.data.vo.Cmd;
import org.tain.tools.node.MonJsonNode;
import org.tain.utils.CurrentInfo;
import org.tain.utils.Sleep;

import lombok.extern.slf4j.Slf4j;

@Deprecated
@Component
@Slf4j
public class AsyncCmdTask {

	@SuppressWarnings("unused")
	@Autowired
	private WorkingData workingData;
	
	///////////////////////////////////////////////////////////////////////////
	
	private boolean flagKeep = true;
	
	public void stopAsync() {
		this.flagKeep = false;
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	@Async(value = "async_0101")
	public void async_0101(Cmd cmd) throws Exception {
		log.info("KANG-20210615 >>>>> async_0101 START {} {}", cmd, CurrentInfo.get());
		
		if (Boolean.TRUE) {
			this.flagKeep = true;
			int period = Integer.parseInt(cmd.getCmdPeriod());
			if (period < 0) {
				cmdKeepSingle(cmd);
			} else {
				cmdAgainSingle(cmd);
			}
		}
		
		if (Boolean.TRUE) {
			// update table to set stop-flag
		}
		
		if (Boolean.TRUE) {
			System.out.println("+---------------------------------------------+");
			System.out.println("|                                             |");
			System.out.println("|       Stop of the Async                     |");
			System.out.println("|                                             |");
			System.out.println("+---------------------------------------------+");
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	private void cmdAgainSingle(Cmd cmd) throws Exception {
		log.info("KANG-20200721 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			int period = Integer.parseInt(cmd.getCmdPeriod());
			
			// spring async kill thread
			for (int idx=0; this.flagKeep; idx++) {
				log.info(">>>>> cmd: {} {}", cmd, idx);
				MonJsonNode nodeResult = new MonJsonNode("{}");
				if (Boolean.TRUE) {
					//nodeResult.put("svrCode", cmd.getSvrCode());
					nodeResult.put("msgCode", "CMD_RET");
					//nodeResult.put("cmdCode", cmd.getCmdCode());
					//nodeResult.put("cmdName", cmd.getCmdName());
					//nodeResult.put("cmdDesc", cmd.getCmdDesc());
					nodeResult.put("cmdPeriod", cmd.getCmdPeriod());
					//nodeResult.put("cmdType", cmd.getCmdType());
					nodeResult.put("cmdArr", cmd.getCmdArr());
					//nodeResult.put("cmdDttm", LocalDateTime.now());
				}
				
				StringBuffer sb = null;
				String line = null;
				Process process = null;
				if (Boolean.TRUE) {
					// run process and get the result
					sb = new StringBuffer();
					process = Runtime.getRuntime().exec(cmd.getCmdArr());
				}
				
				if (Boolean.TRUE) {
					BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));  // OUTPUT ?EUC-KR
					while ((line = br.readLine()) != null) {
						sb.append(line).append("\n");
					}
				}
				
				if (Boolean.TRUE) {
					BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream(), "UTF-8"));  // ERROR ?EUC-KR
					while ((line = br.readLine()) != null) {
						sb.append(line).append("\n");
					}
				}
				
				if (Boolean.TRUE) {
					@SuppressWarnings("unused")
					int exitVal = process.waitFor();
					@SuppressWarnings("unused")
					int len = sb.length();
					process.destroy();
					
					nodeResult.put("cmdResult", sb.toString());
				}
				
				if (Boolean.TRUE) {
					//this.workingData.getQueueSendResult().set(nodeResult);
					if (Boolean.TRUE) System.out.println(">>>>> setQueue.nodeResult: " + nodeResult.toPrettyString());
				}
				
				// if period == 0, then to single command
				if (period == 0)
					break;
				
				// sleep, wait for period
				Sleep.run(Integer.parseInt(cmd.getCmdPeriod()) * 1000);
			}
		}
	}
	
	private void cmdKeepSingle(Cmd cmd) throws Exception {
		log.info("KANG-20200721 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			// spring async kill thread
			log.info(">>>>> cmd: {} {}", cmd);
			MonJsonNode nodeResult = new MonJsonNode("{}");
			if (Boolean.TRUE) {
				//nodeResult.put("svrCode", cmd.getSvrCode());
				nodeResult.put("msgCode", "CMD_RET");
				//nodeResult.put("cmdCode", cmd.getCmdCode());
				//nodeResult.put("cmdName", cmd.getCmdName());
				//nodeResult.put("cmdDesc", cmd.getCmdDesc());
				nodeResult.put("cmdPeriod", cmd.getCmdPeriod());
				//nodeResult.put("cmdType", cmd.getCmdType());
				nodeResult.put("cmdArr", cmd.getCmdArr());
				//nodeResult.put("cmdDttm", LocalDateTime.now());
			}
			
			if (Boolean.TRUE) {
				// run process and get the result
				Process process = Runtime.getRuntime().exec(cmd.getCmdArr());
				
				BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
				String line = null;
				while ((line = br.readLine()) != null && this.flagKeep) {
					nodeResult.put("cmdResult", line + "\n");
					if (Boolean.TRUE) {
						//this.workingData.getQueueSendResult().set(nodeResult);
					}
				}
				
				process.waitFor();
				process.destroy();
			}
		}
	}
}
