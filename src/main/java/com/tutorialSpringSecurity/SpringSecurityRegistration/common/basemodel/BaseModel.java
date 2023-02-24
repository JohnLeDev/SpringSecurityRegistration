package com.tutorialSpringSecurity.SpringSecurityRegistration.common.basemodel;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected UUID id;
	
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date created;
	
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	protected Date lastModified;
	
}
