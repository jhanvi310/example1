package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.hello.ExampleHandler;

import reactor.core.publisher.Mono;

@Service
public class ExampleService {
	
@Autowired
private ExampleHandler handler;

	public Mono<ServerResponse> helloWorld(){
		Mono<ServerResponse> getmsg = handler.hello(null);
		return getmsg;
	}

}

