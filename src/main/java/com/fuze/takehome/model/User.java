package com.fuze.takehome.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {

	private Long id;

	@NotNull(message = "customerId cannot be null")
	private Long customerId;

	@NotNull(message = "departmentIds cannot be null")
	private List<Long> deptIdList = new ArrayList<>();

	@NotNull(message = "userName cannot be null")
	private String userName;

	private String firstName;

	private String lastName;

	@Email
	private String email;

	@Size(max = 20, message = "telephoneNumber maximum length is 20 characters")
	private String telephoneNumber;

	@Size(max = 20, message = "mobileNumber maximum length is 20 characters")
	private String mobileNumber;

	@Size(max = 20, message = "mobileNumber maximum length is 20 characters")
	private String faxNumber;

	@NotNull(message = "departmentId cannot be null")
	private Long departmentId;

	@NotNull(message = "active cannot be null")
	private boolean active;

	public Long getId() {
		return id;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public String getUserName() {
		return userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	
	public List<Long> getDeptIdList() {
		return deptIdList;
	}

	public void setDeptIdList(List<Long> deptIdList) {
		this.deptIdList = deptIdList;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	public User withId(Long id) {
		this.id = id;
		return this;
	}

	public User withCustomerId(Long customerId) {
		this.customerId = customerId;
		return this;
	}

	public User withUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public User withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public User withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public User withEmail(String email) {
		this.email = email;
		return this;
	}

	public User withTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
		return this;
	}

	public User withMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
		return this;
	}

	public User withFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
		return this;
	}

	public User withDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
		this.deptIdList.add(departmentId);
		return this;
	}

	public User withActive(boolean active) {
		this.active = active;
		return this;
	}
	
	public User withDepIdList(List<Long> deptIdList) {
		this.deptIdList = deptIdList;
		return this;
	}
}
