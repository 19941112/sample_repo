package com.example.demo;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sample")
public class sample {
	
	@GetMapping(value = "/publish")
    public String sendMessageToKafkaTopic() {
        return "App successfully deployed to Azure !";
    }
	

}
