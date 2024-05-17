package com.example.demo.controller;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    @ResponseBody
    public ResponseEntity dimeLindura(){
        return new ResponseEntity<>("Hola hermoso 😍", HttpStatus.OK);
    }
}
