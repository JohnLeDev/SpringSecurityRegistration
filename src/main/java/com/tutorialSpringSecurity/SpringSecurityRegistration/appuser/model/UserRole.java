package com.tutorialSpringSecurity.SpringSecurityRegistration.appuser.model;

import com.tutorialSpringSecurity.SpringSecurityRegistration.common.basemodel.BaseModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="role_app")
public class UserRole extends BaseModel{
	
	private String role;
}
