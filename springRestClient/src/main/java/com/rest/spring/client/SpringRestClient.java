package com.rest.spring.client;

import org.springframework.web.client.RestTemplate;

/**
 * Created by bfitouri on 16/06/16.
 */
public class SpringRestClient {

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8080/ping", String.class);

        String response2 = restTemplate.getForObject("http://localhost:8080/hello?name=bilel", String.class);

        System.out.println(response);
        System.out.println(response2);

    }

}
