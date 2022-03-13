package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.example.service.ExampleService;

import io.swagger.annotations.ApiOperation;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/example")
public class ExampleController {
	@Autowired
	private ExampleService service;
	@ApiOperation(value="hello swagger", notes="display the message")
	@GetMapping("/say")
	public String say() {
		return "Hello Swagger";
	}

	@GetMapping(value = "/example",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Mono<ServerResponse> getMessage() {
        return service.helloWorld();
    }
}
