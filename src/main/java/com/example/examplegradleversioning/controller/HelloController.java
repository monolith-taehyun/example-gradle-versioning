package com.example.examplegradleversioning.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public ResponseEntity hello(String name) {
        String message = "Hello " + name;
        return ResponseEntity.ok(message);
    }

    @GetMapping("hi")
    public ResponseEntity hi(String name) {
        String message = "Hi " + name;
        return ResponseEntity.ok(message);
    }

    @GetMapping("greeting")
    public ResponseEntity greeting(String name) {
        String message = "Greeting  " + name;
        return ResponseEntity.ok(message);
    }
}