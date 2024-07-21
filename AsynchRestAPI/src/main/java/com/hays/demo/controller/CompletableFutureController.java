package com.hays.demo.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompletableFutureController {
	
	@GetMapping("completable-future")
	public CompletableFuture<String> processWithCompletableFuture(){
		return CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Processed With CompletableFuture";
		});
	}

}
