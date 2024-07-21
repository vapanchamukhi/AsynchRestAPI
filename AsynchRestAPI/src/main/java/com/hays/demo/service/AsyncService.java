package com.hays.demo.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
	
	@Async
	public CompletableFuture<String> asyncMethod(){
		return CompletableFuture.completedFuture("Request Handled with Completable Future");
	}

}
