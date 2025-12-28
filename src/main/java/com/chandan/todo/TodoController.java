package com.chandan.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String home() {
        return "APPLICATION IS WORKING";
    }
}

