package com.luv2code.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/test")
public class studentController {
	@Autowired
	private CustomerService customerservice;

	@GetMapping("/all")
	public List<Customer> getCustomers(){
	return customerservice.getCustomers();

	}
}
