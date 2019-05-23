package com.yuri.perez.app.controller;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.yuri.perez.app.dto.OutputDTO;
import com.yuri.perez.app.service.GeneratedService;

@Controller
public class TestController implements ITestController{

	private static Logger LOGGER = LogManager.getLogger(TestController.class);
	
	@Autowired
	private GeneratedService generatedService;
	
	
	@Override
	public OutputDTO generate() throws IOException {
		LOGGER.info("INIT generate()");
		return generatedService.generateBodyRequest();
	}

}
