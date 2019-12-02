package com.irerin07.todo.Controller;

import com.irerin07.todo.Domain.Todo;
import com.irerin07.todo.Service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoController {
    @Autowired
    private TodoService todoService;

//    public TodoController(TodoService todoService) {
//        this.todoService = todoService;
//    }

    @GetMapping
    public ResponseEntity<List<Todo>> getTodos() {
        List<Todo> todos = null;
        try{
            todos = todoService.getTasks();
        }catch(Exception e){
            System.out.println(e);
        }
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }
}