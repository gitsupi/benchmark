package com.agf.god.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class GreetingWebClient {
	private WebClient client = WebClient.create("http://localhost:5050");

	private Mono<ClientResponse> result = client.get()
			.uri("/")
			.accept(MediaType.ALL)
			.exchange();

	public String getResult() {

		return ">> result = " + result.flatMap(res -> {
			System.out.println(res.statusCode());
			return res.bodyToMono(String.class);
		}).block();
	}

	public static void main(String[] args) {
		System.out.println(new GreetingWebClient().getResult());
	}


}