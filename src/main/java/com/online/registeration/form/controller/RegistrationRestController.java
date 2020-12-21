/**
 * 
 */
package com.online.registeration.form.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.online.registeration.form.entity.RegistrationModelClass;
import com.online.registeration.form.services.RegistrationServiceClass;

/**
 * @author user
 *
 */


@RestController
public class RegistrationRestController {
	
	@Autowired
	RegistrationServiceClass registrationServiceClass;
	


    @RequestMapping(value= "/registeration", method= RequestMethod.POST)
    public RegistrationModelClass addRegistrationDetails(@ModelAttribute RegistrationModelClass registrationModelClass) {
    	
//    	System.out.println(">>>>>>>>>>>>>gender>>>>>>>>>"+registrationModelClass.getGender());
    	return registrationServiceClass.registerStudentDetails(registrationModelClass);
    }
    
    @GetMapping(value= "/studentDetails")
    public ArrayList<RegistrationModelClass> getStudentDetails() {
    	ArrayList<RegistrationModelClass> classObj=null;

    	try {
    		classObj=	registrationServiceClass.getStudentDetails();
    		System.out.println("=======>"+classObj);

		} catch (Exception e) {
e.printStackTrace();
}
    	return classObj;
    }
    
    
    
}
