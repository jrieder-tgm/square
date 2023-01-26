package com.example.square;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/api/square")
    public int square(int n) {
        return n*n;
    }
}
