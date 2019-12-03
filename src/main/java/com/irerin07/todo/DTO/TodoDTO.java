package com.irerin07.todo.DTO;

import com.irerin07.todo.Repository.TodoRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Getter
@Setter
public class TodoDTO {

    private long id;
    private String title;
    private Date deadline;
}
