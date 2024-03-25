package com.spring.bioMedical.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Thavakethan
 * @github Thavakethan
 *
 */
@Controller
public class LoginController {


	@RequestMapping("/showMyLoginPage")
	public String showHome()
	{
		
		return "login";
	}

	
/*
	@RequestMapping("/authenticateTheUser")
	public String shwHome()
	{
		
		return "user/success";
	}*/


}
