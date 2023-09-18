package com.example.examplegradleversioning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("f5")
public class Feature5Controller {

    @GetMapping("hello")
    public ResponseEntity hello(String name) {
        String message = "Hello " + name;
        return ResponseEntity.ok(message);
    }
}