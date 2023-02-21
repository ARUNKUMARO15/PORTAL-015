package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController
{
	public String myFav()
	{
		return "Black";
	}
	@GetMapping("/keerthi")
	public String getMyFav() {
	return "My favourite color is "+ myFav();
	}
}
