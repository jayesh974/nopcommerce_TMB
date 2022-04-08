package com.nopcommerce.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public class PersonData {
	
	private String userEmail;
	private String userPassword;
	private boolean  isMale;

}
