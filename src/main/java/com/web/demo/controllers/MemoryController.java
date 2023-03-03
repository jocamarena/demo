package com.web.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/memories")
public class MemoryController {
    @GetMapping
    public String getString(){
        return "hello";
    }
}
