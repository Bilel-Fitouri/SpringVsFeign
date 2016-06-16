package com.rest.feign.client;

import feign.Feign;

/**
 * Created by bfitouri on 16/06/16.
 */
public class FeignRestClient {

    public static void main(String[] args) {
        RestApi ping =
            Feign.builder().target(RestApi.class, "http://localhost:8080");

        String response = ping.ping();

        String hello = ping.sayHello("bilel");

        System.out.println(response);
        System.out.println(hello);
    }
}
