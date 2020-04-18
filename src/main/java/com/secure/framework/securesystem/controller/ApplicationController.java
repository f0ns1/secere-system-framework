package com.secure.framework.securesystem.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	private static final String HEADER="ApplicationController.";
	private String logData;
	private Logger log = Logger.getLogger(HEADER);
	private static final  String INDEX_MAPPING="/";
	
	
	@RequestMapping(INDEX_MAPPING)
	public String index(HttpServletRequest request, HttpServletResponse response) {
		logData = HEADER + "index()";
		log.info(logData);
		return "index";
	}
}
