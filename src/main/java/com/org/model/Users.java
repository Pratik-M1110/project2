package com.org.model;


import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Users {


	@Id
	private String email;
	private String first_name;
	private String last_name;
	private String password;
	private Role role;
	private LocalDate dob;
	private String mobile_no;
	private Gender gender;
	
	
	
	public Users() {
	}

}