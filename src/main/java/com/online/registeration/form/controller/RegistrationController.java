/**
 * 
 */
package com.online.registeration.form.controller;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.registeration.form.entity.RegistrationModelClass;

/**
 * @author user
 *
 */
@Component
@Controller
public class RegistrationController {
	
	@RequestMapping(value="/")
	public String LoadRegistrationForm() {
		
		return "home.html";
	}
	
	
	
//	@RequestMapping(value="/getStudentDetails")
//	public @ResponseBody List<RegistrationModelClass> StudentDetails() {
////		List<RegistrationModelClass> registrModelObj=new <RegistrationModelClass>();
//		return findStudentDetails();
//	}
//	
//	public List<RegistrationModelClass> findStudentDetails(){
//		List<RegistrationModelClass> registrModelObj=new List<RegistrationModelClass>();
//
//		return registrModelObj;
//		
//	}
}
