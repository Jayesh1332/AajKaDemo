package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentController {
	@GetMapping("Document/{type}")
	public String PrintDocument(@PathVariable String type) {
		ExelService es = new ExelService();
		
		es.readDocument();
		es.processDocument();
		return es.printDocument();

	}

}
