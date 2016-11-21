package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Value;


@RestController
public class ClientController {
	
    @Value("${from}")
    private String from;
    
    @RequestMapping("/from")
    public String from() {
        return this.from;
    }

}
