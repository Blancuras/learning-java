package com.saxa.services;

import com.saxa.dtos.GatoDTO;

public class CatServices {

	public static void main(String[] args) {
		GatoDTO tonchi = new GatoDTO(); 
		tonchi.setAge(4);
		tonchi.setDescription("cafe"); 
		tonchi.setName("pelusa");
		tonchi.printCat();
	}
}
