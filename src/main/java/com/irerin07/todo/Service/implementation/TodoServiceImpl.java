package com.irerin07.todo.Service.implementation;

import com.irerin07.todo.Domain.Todo;
import com.irerin07.todo.Repository.TodoRepository;
import com.irerin07.todo.Service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

//    public TodoServiceImpl(TodoRepository todoRepository) {
//        this.todoRepository = todoRepository;
//    }

    @Override
    public List<Todo> getTasks() {
        List<Todo> lists = todoRepository.findAll();

        return lists;
    }
}