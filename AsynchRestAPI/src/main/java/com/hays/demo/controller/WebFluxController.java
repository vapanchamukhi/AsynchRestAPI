package com.hays.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class WebFluxController {
	
	@GetMapping("/webflux")
	public Mono<String> processWithWebFlux(){
		return Mono.just("Request Handled with WebFlux");
	}

}
