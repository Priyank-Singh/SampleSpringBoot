package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/numbers")
public class Controller {
	
	@Autowired
	private ServiceImpl service;
	
	@GetMapping("/product")
	public double product(@RequestBody IntegerDTO dto)
	{
		return service.method(dto);
	}

}
