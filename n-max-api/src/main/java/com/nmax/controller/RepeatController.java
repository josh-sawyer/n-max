package com.nmax.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nmax.dto.MessageDto;
import com.nmax.service.RepeatService;

@RestController
@RequestMapping("repeat")
public class RepeatController {
	
	private static final Logger LOG = LoggerFactory.getLogger(RepeatController.class);
	
	private RepeatService repeatService;
	
	@Autowired
	public RepeatController(RepeatService repeatService) {
		this.repeatService = repeatService;
	}
	
	@GetMapping("map")
	public Map<String, String> repeatMap(@RequestParam(required = false) String message) {
		LOG.info("[REPEAT][CONTROLLER][MAP][" + message + "]");
		return repeatService.repeatMap(message);
	}
	
	@GetMapping("obj")
	public MessageDto repeatObj(@RequestParam(required = false) String message) {
		LOG.info("[REPEAT][CONTROLLER][MAP][" + message + "]");
		return repeatService.repeatObj(message);
	}

}
