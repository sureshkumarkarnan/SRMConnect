package com.srm.tasks.services;

import com.srm.tasks.model.Task;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TaskService {

    public Task getTask(String TaskId){
        return new Task()
                .withId(TaskId)
                .withuserId( UUID.randomUUID().toString() )
                .withProductName("Test Product Name")
                .withTaskType("PerSeat");
    }

    public void saveTask(Task Task){

    }

    public void updateTask(Task Task){

    }

    public void deleteTask(Task Task){

    }

}
