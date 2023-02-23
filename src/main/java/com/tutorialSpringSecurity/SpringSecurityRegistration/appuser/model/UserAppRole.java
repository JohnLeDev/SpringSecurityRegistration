package com.tutorialSpringSecurity.SpringSecurityRegistration.appuser.model;

import java.util.UUID;

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
@Table(name="user_app_role")
public class UserAppRole extends BaseModel{
	private UUID userId;
	private UUID roleId;
}
