package com.nmax.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nmax.dto.MessageDto;

@RestController
@RequestMapping("repeat")
public class RepeatController {
	
	private static final Logger LOG = LoggerFactory.getLogger(RepeatController.class);
	
	@GetMapping("map")
	public Map<String, String> repeatMap(@RequestParam(required = false) String message) {
		LOG.info("[REPEAT][MAP][" + message + "]");
		Map<String, String> toReturn = new HashMap<>();
		toReturn.put("type", "Map");
		if (message == null) {
			toReturn.put("message", "You did not send a message you dummy. To add message /map?message=YOUR MESSAGE");
		} else {
			toReturn.put("message", message);
		}
		return toReturn;
	}
	
	@GetMapping("obj")
	public MessageDto repeatObj(@RequestParam(required = false) String message) {
		LOG.info("[REPEAT][MAP][" + message + "]");
		MessageDto toReturn = new MessageDto(message);
		return toReturn;
	}

}
