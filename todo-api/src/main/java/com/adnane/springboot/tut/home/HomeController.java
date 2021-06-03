package com.adnane.springboot.tut.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
	public String greeting() {
		return "salam alikom ya  yahoo";
	}
    
    @GetMapping("/{ism}")
    public String greetingwithname(@PathVariable String ism) {
		return String.format("salam ya %s :", ism);
	}
}
