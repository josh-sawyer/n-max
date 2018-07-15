package com.nmax.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.nmax.dto.MessageDto;

@Service
public class RepeatService {
	
	private static final Logger LOG = LoggerFactory.getLogger(RepeatService.class);

	public Map<String, String> repeatMap(String message) {
		LOG.info("[REPEAT][SERVICE][MAP][" + message + "]");
		Map<String, String> toReturn = new HashMap<>();
		toReturn.put("type", "Map");
		if (message == null) {
			toReturn.put("message", "You did not send a message you dummy. To add message /map?message=YOUR MESSAGE");
		} else {
			toReturn.put("message", message);
		}
		return toReturn;
	}

	public MessageDto repeatObj(String message) {
		LOG.info("[REPEAT][SERVICE][MAP][" + message + "]");
		MessageDto toReturn = new MessageDto(message);
		return toReturn;
	}

}
