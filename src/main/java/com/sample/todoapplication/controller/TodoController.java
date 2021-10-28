package com.sample.todoapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    public List<String> getTodos() {
        return Collections.emptyList();
    }

}
