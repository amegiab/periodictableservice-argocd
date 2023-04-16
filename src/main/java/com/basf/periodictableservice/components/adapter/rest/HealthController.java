package com.basf.periodictableservice.components.adapter.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
    @Value("${spring.application.version}")
    private String version;

    @GetMapping()
    public String health() {
        return "OK";
    }

    @GetMapping("/version")
    public String version() {
        return version;
    }
}

