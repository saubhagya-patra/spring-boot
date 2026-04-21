package com.example.hello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping("/hello")
    public ResponseEntity<String> hello(@RequestParam("name") String name) {
       String data = "Hello " + name;
       return ResponseEntity.ok(data);
   }

    @GetMapping("/user")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("fetching...");
    }
}
