package org.tain.controller.campPageChar;

import java.net.http.HttpHeaders;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.tain.domain.campPageChar.CampPageChar;
import org.tain.repository.campPageChar.CampPageCharRepository;
import org.tain.utils.CurrentInfo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = {"/rest/campPageChar"})
@Slf4j
public class CampPageCharRestController {

	@Autowired
	private CampPageCharRepository campPageCharRepository;
	
	@RequestMapping(value = {"/list"}, method = {RequestMethod.GET, RequestMethod.POST})
	public ResponseEntity<?> list(HttpEntity<String> httpEntity) throws Exception {
		log.info("KANG-20210330 >>>>> {} {}", CurrentInfo.get());
		
		List<CampPageChar> list = this.campPageCharRepository.findAll();
		
		MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();
		//headers.add("Content-Type", "application/json; charset=UTF-8");
		headers.add(org.springframework.http.HttpHeaders.CONTENT_TYPE, "application/json; charset=UTF-8");
		
		return new ResponseEntity<>(list, headers, HttpStatus.OK);
	}
	
	@RequestMapping(value = {"/list2"}, method = {RequestMethod.GET, RequestMethod.POST})
	public List<CampPageChar> list2() throws Exception {
		log.info("KANG-20210330 >>>>> {} {}", CurrentInfo.get());
		return this.campPageCharRepository.findAll();
	}
}