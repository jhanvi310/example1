package com.example.hello;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class ExampleHandler {

  @SuppressWarnings("deprecation")
public Mono<ServerResponse> hello(ServerRequest request) {
    return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
         .body(BodyInserters.fromObject("Hello, Spring Webflux Example!"));
  }
  
  @SuppressWarnings("deprecation")
public Mono<ServerResponse> helloFurther1(ServerRequest request) {
	  return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
	    .body(BodyInserters.fromObject("Hello, Spring Webflux Example 1!"));
	}

	@SuppressWarnings("deprecation")
	public Mono<ServerResponse> helloFurther2(ServerRequest request) {
	  return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
	    .body(BodyInserters.fromObject("Hello, Spring Webflux Example 2!"));
	}
}