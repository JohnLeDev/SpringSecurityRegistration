package com.tutorialSpringSecurity.SpringSecurityRegistration.appuser.model;

import java.util.Date;

import com.tutorialSpringSecurity.SpringSecurityRegistration.common.basemodel.BaseModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="user_app")
public class UserApp extends BaseModel{
	private String userapp;
	private String password;
	private Date dob;
	private String phonenumber;
	private String description;
}
