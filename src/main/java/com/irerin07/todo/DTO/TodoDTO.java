package com.irerin07.todo.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TodoDTO {

    private long id;
    private String title;
    private Date deadline;
}
