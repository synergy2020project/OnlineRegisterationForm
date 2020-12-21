/**
 * 
 */
package com.online.registeration.form.servicesimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.registeration.form.entity.RegistrationModelClass;
import com.online.registeration.form.repository.RegistrationRepositoryInterface;
import com.online.registeration.form.services.RegistrationServiceClass;

/**
 * @author user
 *
 */
@Service("RegistrationServiceClass")
public class RegistrationServiceImplClass implements RegistrationServiceClass{

	@Autowired
	private RegistrationRepositoryInterface registrationRepositoryInterface;
	
	@Override
	public RegistrationModelClass registerStudentDetails(RegistrationModelClass registrationModelClass) {
				try {
					System.out.println(":>>>>>>>>>"+registrationModelClass.getStudent_name());

			registrationRepositoryInterface.save(registrationModelClass);
//			RegistrationModelClass registrationObject=new RegistrationModelClass();
			
			return null;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
		
	}
//
//	@Override
//	public ArrayList<RegistrationModelClass> getStudentDetails() {
//		// TODO Auto-generated method stub
//		return 			 (ArrayList<RegistrationModelClass>) registrationRepositoryInterface.findAll();
//
//	}

	@Override
	public ArrayList<RegistrationModelClass> getStudentDetails() {
		ArrayList<RegistrationModelClass> classObj=null;

    	try {
    		classObj=	 (ArrayList<RegistrationModelClass>) registrationRepositoryInterface.findAll();
    		System.out.println("=======>"+classObj);

		} catch (Exception e) {

			e.printStackTrace();
		}		
		return  classObj;
	}


	




}
