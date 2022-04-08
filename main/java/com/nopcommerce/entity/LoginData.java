package com.nopcommerce.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public class LoginData {
	
	private String loginEmail;
	private String loginPassword;

}
