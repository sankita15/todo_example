package com.sample.todoapplication.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoControllerTest {

    private final TodoController todoController = new TodoController();

    @Test
    @DisplayName("Should return list of Todos")
    void shouldReturnTodos() {
        assertEquals(todoController.getTodos(), Collections.emptyList());
    }
}
