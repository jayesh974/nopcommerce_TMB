package com.nopcommerce.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public class TestData {
	
	private LoginData loginData ;
	
	private PersonData personData;

}
