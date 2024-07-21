package com.hays.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@RestController
public class DeferredResultController {
	
	@GetMapping("/deferredresult")
	public DeferredResult<String> processWithDeferredResult(){
		DeferredResult<String> result = new DeferredResult<>();
		new Thread(() -> {
			try {
				Thread.sleep(1000);
				result.setResult("Processed with Deferred Result");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				result.setErrorResult(e);
			}
		}).start();
		return result;
	}

}
