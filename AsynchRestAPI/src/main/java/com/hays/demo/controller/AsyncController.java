package com.hays.demo.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hays.demo.service.AsyncService;

@RestController
public class AsyncController {
	
	@Autowired
	AsyncService service;
	
	@GetMapping("/async")
	public CompletableFuture<String> processWithAsync(){
		return service.asyncMethod();
	}

}
