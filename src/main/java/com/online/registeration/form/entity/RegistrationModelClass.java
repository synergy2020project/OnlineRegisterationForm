/**
 * 
 */
package com.online.registeration.form.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author user
 *
 */

@Entity
@Table(name = "student_reg_details")
public class RegistrationModelClass {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")

	private Integer id;

	@Column(name="student_name")
	private String student_name;
	
	
	@Column(name="gender")
	private char gender;
	
	
	@Column(name="dob")

	private String dob;
	
	@Column(name="school_name")

	private String school_name;
	@Column(name="class_name")

	private String class_name;
	@Column(name="section_name")

	private String section_name;
	@Column(name="phone_number")

	private String phone_number;
	@Column(name="email_address")

	private String email_address;
	@Column(name="current_address")

	private String current_address;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getSection_name() {
		return section_name;
	}
	public void setSection_name(String section_name) {
		this.section_name = section_name;
	}

	
	
	
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getCurrent_address() {
		return current_address;
	}
	public void setCurrent_address(String current_address) {
		this.current_address = current_address;
	}
//	@Override
//	public String toString() {
//		return "RegistrationModelClass [id=" + id + ", student_name=" + student_name + ", gender=" + gender + ", dob="
//				+ dob + ", school_name=" + school_name + ", class_name=" + class_name + ", section_name=" + section_name
//				+ ", phone_number=" + phone_number + ", email_address=" + email_address + ", current_address="
//				+ current_address + ", getId()=" + getId() + ", getStudent_name()=" + getStudent_name()
//				+ ", getGender()=" + getGender() + ", getDob()=" + getDob() + ", getSchool_name()=" + getSchool_name()
//				+ ", getClass_name()=" + getClass_name() + ", getSection_name()=" + getSection_name()
//				+ ", getPhone_number()=" + getPhone_number() + ", getEmail_address()=" + getEmail_address()
//				+ ", getCurrent_address()=" + getCurrent_address() + ", getClass()=" + getClass() + ", hashCode()="
//				+ hashCode() + ", toString()=" + super.toString() + "]";
//	}
	
	
	
	
	

}
