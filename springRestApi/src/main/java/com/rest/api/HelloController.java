package com.rest.api; /**
 * Created by bfitouri on 22/01/16.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @RequestMapping(value = "/ping", method=RequestMethod.GET)
    public String ping() {
        return "pong pong";
    }

    @RequestMapping(value = "/hello", method=RequestMethod.GET)
    public String pingByName(@RequestParam(value="name") String name) {
        return "Hello " + name;
    }

}