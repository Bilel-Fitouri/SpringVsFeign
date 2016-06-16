package com.rest.feign.client;

import feign.Param;
import feign.RequestLine;

/**
 * Created by bfitouri on 16/06/16.
 */
public interface RestApi {

    @RequestLine("GET /ping")
    String ping();

    @RequestLine("GET /hello?name={name}")
    String sayHello(@Param("name") String in);
}
