/**
 * 
 */
package com.online.registeration.form.repository;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.online.registeration.form.entity.RegistrationModelClass;

/**
 * @author user
 *
 */

@Repository("RegistrationRepositoryInterface")
public interface RegistrationRepositoryInterface extends JpaRepository<RegistrationModelClass, Integer> {
	
//	   @Query("SELECT t FROM RegistrationModelClass t ") 
//	   List<RegistrationModelClass> getClassVal();

}
