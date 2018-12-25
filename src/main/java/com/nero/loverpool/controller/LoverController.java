package com.nero.loverpool.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nero.loverpool.model.Lover;
import com.nero.loverpool.service.LoverService;

@RestController
@RequestMapping("/lover")
public class LoverController {
	
	private static Logger logger = LoggerFactory.getLogger(LoverController.class);
	
	@Autowired
	LoverService loverService;
	
	@RequestMapping(value="/info", method=RequestMethod.POST)
	@ResponseBody
	private Lover queryLoverByName(@RequestBody Lover lover) {
		logger.info("Query Lover by name.!" + lover.getLovername());
		return loverService.getLover(lover);
	}
	
	@RequestMapping(value="/info", method=RequestMethod.PUT)
	@ResponseBody
	private int creatLover(@RequestBody Lover lover) {
		logger.info("creatLover Lover.!" + lover.getLovername());
		return loverService.insertLover(lover);
	}
}
