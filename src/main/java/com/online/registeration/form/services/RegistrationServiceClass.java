/**
 * 
 */
package com.online.registeration.form.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.registeration.form.entity.RegistrationModelClass;

/**
 * @author user
 *
 */

public interface RegistrationServiceClass {

	
	public RegistrationModelClass registerStudentDetails(RegistrationModelClass registrationModelClass);
	public ArrayList<RegistrationModelClass> getStudentDetails();

    
//	public Integer max();

    

}