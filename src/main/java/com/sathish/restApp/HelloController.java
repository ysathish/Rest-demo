package com.sathish.restApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @RequestMapping("/")

    public String greet() {
        return "hello";
    }
}
