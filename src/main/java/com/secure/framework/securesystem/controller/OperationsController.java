package com.secure.framework.securesystem.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.secure.framework.securesystem.bean.request.GetNodeBean;
import com.secure.framework.securesystem.bean.request.RemoveBean;
import com.secure.framework.securesystem.bean.request.SignUpBean;



@RestController
public class OperationsController {
	private String HEADER="OperationsController.";
	private String logData;
	private static final String SIGNUP_MAPPING="/api/sign-up";
	private static final String GETNODE_MAPPING="/api/get-node";
	private static final String REMOVE_MAPPING="/api/remove-node";
	private static final String LIST_MAPPING="/api/list-node";
	private Logger log= Logger.getLogger(HEADER);
	
	@RequestMapping(value = SIGNUP_MAPPING, method = RequestMethod.POST)
	public String signUpController(@RequestBody SignUpBean body, HttpServletResponse response) {
		logData = HEADER + "encryptServiceJDKControler() init method ";
		log.info(logData);
		
		return "";
	}
	
	
	@RequestMapping(value = GETNODE_MAPPING, method = RequestMethod.POST)
	public String getNodeController(@RequestBody GetNodeBean body, HttpServletResponse response) {
		logData = HEADER + "encryptServiceJDKControler() init method ";
		log.info(logData);
		
		return "";
	}
	
	@RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
	public String removeController(@RequestBody RemoveBean body, HttpServletResponse response) {
		logData = HEADER + "encryptServiceJDKControler() init method ";
		log.info(logData);
		return "";
	}
	
	
	@RequestMapping(value = LIST_MAPPING, method = RequestMethod.GET)
	public String listNodesController(HttpServletResponse response) {
		logData = HEADER + "encryptServiceJDKControler() init method ";
		log.info(logData);
		
		return "";
	}

}
