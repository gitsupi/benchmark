package com.agf.god.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);

        GreetingWebClient gwc = new GreetingWebClient();

        System.out.println(gwc.getResult());
    }

}
