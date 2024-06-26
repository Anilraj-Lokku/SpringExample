package com.anil.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.anil.service.MyService;

@RestController
public class MyController {
	@Autowired
	private MyService ms;

	@GetMapping
	public String home()
	{
		return ms.getAlbumList();
//		return "hello world";
	}
}
