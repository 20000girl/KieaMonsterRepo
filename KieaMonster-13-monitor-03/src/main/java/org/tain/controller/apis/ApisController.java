package org.tain.controller.apis;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.tain.db.domain.TbCmd;
import org.tain.db.service.TbCmdService;
import org.tain.tools.properties.ProjEnvUrlProperties;
import org.tain.utils.CurrentInfo;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(value = {"/cmd"})
@Slf4j
public class ApisController {

	@Autowired
	private ProjEnvUrlProperties projEnvUrlProperties;
	
	@Autowired
	private TbCmdService tbCmdService;

	@RequestMapping(value = {"/orgForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String orgForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/orgForm";
	}
	
	@RequestMapping(value = {"/grpList"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String grpList(Pageable pageable, Model model) {
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/grpList";
	}
	
	@RequestMapping(value = {"/grpForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String grpForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/grpForm";
	}
	
	@RequestMapping(value = {"/grpSvrList"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String grpSvrList(Pageable pageable, Model model) {
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/grpSvrList";
	}
	
	@RequestMapping(value = {"/grpSvrForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String grpSvrForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/grpSvrForm";
	}
	
	@RequestMapping(value = {"/grpCmdList"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String grpCmdList(Pageable pageable, Model model) {
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/grpCmdList";
	}
	
	@RequestMapping(value = {"/grpCmdForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String grpCmdForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/grpCmdForm";
	}
	
	@RequestMapping(value = {"/svrList"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String svrList(Pageable pageable, Model model) {
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/svrList";
	}
	
	@RequestMapping(value = {"/svrForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String svrForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/svrForm";
	}
	
	@RequestMapping(value = {"/svrCmdList"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String svrCmdList(Pageable pageable, Model model) {
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/svrCmdList";
	}
	
	@RequestMapping(value = {"/svrCmdForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String svrCmdForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/svrCmdForm";
	}
	
	@RequestMapping(value = {"/cmdList"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String cmdList(Pageable pageable, Model model) {
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/cmdList";
	}
	
	@RequestMapping(value = {"/cmdForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String cmdForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/cmdForm";
	}
	
	@RequestMapping(value = {"/codeMstList"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String codeMstList(Pageable pageable, Model model) {
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/codeMstList";
	}
	
	@RequestMapping(value = {"/codeMstForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String codeMstForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/codeMstForm";
	}
	
	@RequestMapping(value = {"/usrList"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String usrList(Pageable pageable, Model model) {
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/usrList";
	}
	
	@RequestMapping(value = {"/usrForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String usrForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/usrForm";
	}

	@RequestMapping(value = {"/brwList"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String brwList(Pageable pageable, Model model) {
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/brwList";
	}
	
	@RequestMapping(value = {"/brwForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String brwForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/brwForm";
	}
	
	@RequestMapping(value = {"/codeItemList"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String codeItemList(Pageable pageable, Model model) {
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/codeItemList";
	}
	
	@RequestMapping(value = {"/codeItemForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String codeItemForm(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/codeItemForm";
	}
	
	@RequestMapping(value = {"/svrcmdview"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String svrcmdview(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/svrcmdview";
	}
	
	@RequestMapping(value = {"/grpcmdview"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String grpcmdview(@RequestParam(value = "id", defaultValue = "103") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/grpcmdview";
	}

	
	
	
	@RequestMapping(value = {"/list"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String list(Pageable pageable, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			Page<TbCmd> pageTbCmd = this.tbCmdService.listAll(pageable);
			log.info("KANG-20200730 >>>>> pageTbCmd: {}", pageTbCmd);
			model.addAttribute("cmdList", pageTbCmd);
		}
		
		return "web/cmd/list";
	}
	
	@RequestMapping(value = {"/form"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String form(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		if (Boolean.TRUE) {
			TbCmd tbCmd = this.tbCmdService.getOne(id);
			log.info("KANG-20200730 >>>>> tbCmd: {}", tbCmd);
			log.info("KANG-20200730 >>>>> wsUri: {}", this.projEnvUrlProperties.getWsUri());
			model.addAttribute("cmd", tbCmd);
		}
		
		return "web/cmd/form";
	}
	
	@RequestMapping(value = {"/testCmdForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String testCmdForm(Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		
		if (Boolean.TRUE) {
			String[] lstSvrCode = new String[] { "TEST01", "TEST02", "TEST03", "TEST04", "TEST05", "TEST06", "TEST07" };
			log.info("KANG-20200730 >>>>> lstSvrCode: {}", Arrays.deepToString(lstSvrCode));
			model.addAttribute("lstSvrCode", lstSvrCode);
		}
		
		if (Boolean.TRUE) {
			//String[] lstCmdLoop = new String[] { "keep(noLoop)", "loopSec(5sec)", "loopSec(10sec)", "loopSec(30sec)", "loopSec(60sec)" };
			Map<String,String> mapCmdLoop = new LinkedHashMap<>();
			mapCmdLoop.put("0",  "keep(no Loop)");
			mapCmdLoop.put("5",  "loopSec(5 sec)");
			mapCmdLoop.put("10", "loopSec(10 sec)");
			mapCmdLoop.put("30", "loopSec(30 sec)");
			mapCmdLoop.put("60", "loopSec(60 sec)");
			log.info("KANG-20200730 >>>>> mapCmdLoop: {}", mapCmdLoop);
			model.addAttribute("mapCmdLoop", mapCmdLoop);
		}
		
		if (Boolean.TRUE) {
			String[] lstPrtDir = new String[] { "prepend", "exchange", "append" };
			log.info("KANG-20200730 >>>>> lstPrtDir: {}", Arrays.deepToString(lstPrtDir));
			model.addAttribute("lstPrtDir", lstPrtDir);
		}
		
		return "web/cmd/testCmdForm";
	}
	
	@RequestMapping(value = {"/testCmdIntegrate"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String testCmdIntegrate(Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		
		if (Boolean.TRUE) {
			model.addAttribute("wsUri", this.projEnvUrlProperties.getWsUri());
		}
		
		if (Boolean.TRUE) {
			String[] lstSvrCode = new String[] { "TEST01", "TEST02", "TEST03", "TEST04", "TEST05", "TEST06", "TEST07" };
			log.info("KANG-20200730 >>>>> lstSvrCode: {}", Arrays.deepToString(lstSvrCode));
			model.addAttribute("lstSvrCode", lstSvrCode);
		}
		
		if (Boolean.TRUE) {
			//String[] lstCmdLoop = new String[] { "keep(noLoop)", "loopSec(5sec)", "loopSec(10sec)", "loopSec(30sec)", "loopSec(60sec)" };
			Map<String,String> mapCmdLoop = new LinkedHashMap<>();
			mapCmdLoop.put("0",  "keep(no Loop)");
			mapCmdLoop.put("5",  "loopSec(5 sec)");
			mapCmdLoop.put("10", "loopSec(10 sec)");
			mapCmdLoop.put("30", "loopSec(30 sec)");
			mapCmdLoop.put("60", "loopSec(60 sec)");
			log.info("KANG-20200730 >>>>> mapCmdLoop: {}", mapCmdLoop);
			model.addAttribute("mapCmdLoop", mapCmdLoop);
		}
		
		if (Boolean.TRUE) {
			String[] lstPrtDir = new String[] { "prepend", "exchange", "append" };
			log.info("KANG-20200730 >>>>> lstPrtDir: {}", Arrays.deepToString(lstPrtDir));
			model.addAttribute("lstPrtDir", lstPrtDir);
		}
		
		return "web/cmd/testCmdIntegrate";
	}
	
	/*
	@RequestMapping(value = {""}, method = {RequestMethod.GET, RequestMethod.POST})
	public String form(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		model.addAttribute("apis", this.apisService.findApisById(id));
		model.addAttribute("urlOnline", this.projEnvUrlProperties.getOnline());
		model.addAttribute("urlMapper", this.projEnvUrlProperties.getMapper());
		model.addAttribute("urlSbs01", this.projEnvUrlProperties.getLns01());
		return "web/apis/form";
	}
	
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = {"/pingForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String pingForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		//model.addAttribute("apis", this.apisService.findApisById(id));
		//return "web/apis/pingForm";
		return "redirect:/apis/list";
		//return new RedirectView("/apis/list");
		//return "redirect:/apis/list";
		//return new RedirectView("/apis/list");
	}
	
	@RequestMapping(value = {"/encryptForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String encryptForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		//model.addAttribute("apis", this.apisService.findApisById(id));
		//return "web/apis/encryptForm";
		return "redirect:/apis/list";
		//return new RedirectView("/apis/list");
	}
	
	@RequestMapping(value = {"/decryptForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String decryptForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		//model.addAttribute("apis", this.apisService.findApisById(id));
		//return "web/apis/decryptForm";
		return "redirect:/apis/list";
		//return new RedirectView("/apis/list");
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	@RequestMapping(value = {"/getFeeForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String getFeeForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		model.addAttribute("apis", this.apisService.findApisById(id));
		model.addAttribute("urlOnline", this.projEnvUrlProperties.getOnline());
		model.addAttribute("urlMapper", this.projEnvUrlProperties.getMapper());
		model.addAttribute("urlLns01", this.projEnvUrlProperties.getLns01());
		return "web/apis/getFeeForm";
	}
	
	@RequestMapping(value = {"/validateForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String validateForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		model.addAttribute("apis", this.apisService.findApisById(id));
		model.addAttribute("urlOnline", this.projEnvUrlProperties.getOnline());
		model.addAttribute("urlMapper", this.projEnvUrlProperties.getMapper());
		model.addAttribute("urlLns01", this.projEnvUrlProperties.getLns01());
		return "web/apis/validateForm";
	}
	
	@RequestMapping(value = {"/commitForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String commitForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		model.addAttribute("apis", this.apisService.findApisById(id));
		model.addAttribute("urlOnline", this.projEnvUrlProperties.getOnline());
		model.addAttribute("urlMapper", this.projEnvUrlProperties.getMapper());
		model.addAttribute("urlLns01", this.projEnvUrlProperties.getLns01());
		return "web/apis/commitForm";
	}
	
	@RequestMapping(value = {"/amendForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String amendForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		model.addAttribute("apis", this.apisService.findApisById(id));
		model.addAttribute("urlOnline", this.projEnvUrlProperties.getOnline());
		model.addAttribute("urlMapper", this.projEnvUrlProperties.getMapper());
		model.addAttribute("urlLns01", this.projEnvUrlProperties.getLns01());
		return "web/apis/amendForm";
	}
	
	@RequestMapping(value = {"/refundForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String refundForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20200730 >>>>> {} {}", CurrentInfo.get());
		model.addAttribute("apis", this.apisService.findApisById(id));
		model.addAttribute("urlOnline", this.projEnvUrlProperties.getOnline());
		model.addAttribute("urlMapper", this.projEnvUrlProperties.getMapper());
		model.addAttribute("urlLns01", this.projEnvUrlProperties.getLns01());
		return "web/apis/refundForm";
	}
	
	@RequestMapping(value = {"/detailForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String detailForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20210329 >>>>> {} {}", CurrentInfo.get());
		model.addAttribute("apis", this.apisService.findApisById(id));
		model.addAttribute("urlOnline", this.projEnvUrlProperties.getOnline());
		model.addAttribute("urlMapper", this.projEnvUrlProperties.getMapper());
		model.addAttribute("urlLns01", this.projEnvUrlProperties.getLns01());
		return "web/apis/detailForm";
	}
	
	@RequestMapping(value = {"/historyForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String historyForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20210329 >>>>> {} {}", CurrentInfo.get());
		model.addAttribute("apis", this.apisService.findApisById(id));
		model.addAttribute("urlOnline", this.projEnvUrlProperties.getOnline());
		model.addAttribute("urlMapper", this.projEnvUrlProperties.getMapper());
		model.addAttribute("urlLns01", this.projEnvUrlProperties.getLns01());
		return "web/apis/historyForm";
	}
	
	@RequestMapping(value = {"/customerForm"}, method = {RequestMethod.GET, RequestMethod.POST})
	public String customerForm(@RequestParam(value = "id", defaultValue = "0") Long id, Model model) {
		log.info("KANG-20210329 >>>>> {} {}", CurrentInfo.get());
		model.addAttribute("apis", this.apisService.findApisById(id));
		model.addAttribute("urlOnline", this.projEnvUrlProperties.getOnline());
		model.addAttribute("urlMapper", this.projEnvUrlProperties.getMapper());
		model.addAttribute("urlLns01", this.projEnvUrlProperties.getLns01());
		return "web/apis/customerForm";
	}
	*/
}
