package com.mybatis.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis.spring.service.TestingService;

@RestController
@RequestMapping("/service")
public class MyBatisService {

	@Autowired
	private TestingService testServ;

	public MyBatisService() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/service1")
	public void testService() {
		System.out.println("In My Batis service issss::::::::::::");
		testServ.insert();
	}
}
