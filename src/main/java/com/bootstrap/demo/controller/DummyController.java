package com.bootstrap.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class DummyController {

    @GetMapping(value = "/test/health", produces = MediaType.TEXT_PLAIN_VALUE)
    public String getHealth() {
        return "UP";
    }
}
