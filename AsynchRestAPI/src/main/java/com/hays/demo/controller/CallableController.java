package com.hays.demo.controller;

import java.util.concurrent.Callable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallableController {
	
	@GetMapping("/callable")
	public Callable<String> processWithCallable(){
		return () -> {
			Thread.sleep(10000);
			return "Request processed with Callable";
		};
	}

}
