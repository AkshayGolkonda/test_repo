package com.zensar;

import java.util.List;

public class BuisnessApp {
	
	CityService cityService;
	LoginService loginService;
	
	public BuisnessApp(CityService cityService,LoginService loginService) {
		this.cityService = cityService;
		this.loginService= loginService;
	}
	
	public List<String> retrieveCityListByCountry(String country) {
		List<String> cities =  this.cityService.findCitiesByCountries(country);
		return cities;
	}
	//this is a change
	
	public boolean login(String username,String password) {
		return loginService.authenticate(username, password);
	}

}
