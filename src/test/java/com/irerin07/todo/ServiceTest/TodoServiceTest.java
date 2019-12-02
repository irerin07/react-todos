package com.irerin07.todo.ServiceTest;

import com.irerin07.todo.Domain.Todo;
import com.irerin07.todo.Repository.TodoRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
public class TodoServiceTest {

    @Mock
    private TodoRepository mockRepository;
    private Todo todo;

    @Before
    public void init() {

    }

    @Test
    public void 투두_가져오기(){
    }

    @Test
    public void 존재하지_않는_투두_가져오기(){
        Optional<Todo> todo = mockRepository.findById(65l);
        Assert.assertEquals(Optional.empty(), todo);
    }

    @Test
    public void 투두_저장(){
    }



}
