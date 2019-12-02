package com.irerin07.todo.ServiceTest;

import com.irerin07.todo.Domain.Todo;
import com.irerin07.todo.Repository.TodoRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class TodoServiceTest {

    @Mock
    private TodoRepository mockRepository;
    private Todo todo;

    @Before
    public void init() {

    }

}
