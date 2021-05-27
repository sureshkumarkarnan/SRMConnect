package com.srm.tasks.controllers;

import com.srm.tasks.model.Task;
import com.srm.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="/api/users/{userId}/tasks")
public class TaskServiceController {
    @Autowired
    private TaskService taskservice;

    @RequestMapping(value="/{TaskId}",method = RequestMethod.GET)
    public Task gettasks( @PathVariable("userId") String userId,
                                @PathVariable("TaskId") String TaskId) {

        //return taskservice.getTask(TaskId);
        return new Task()
            .withId(TaskId)
            .withuserId(userId)
            .withProductName("Teleco")
            .withTaskType("Seat");
    }

    @RequestMapping(value="{TaskId}",method = RequestMethod.PUT)
    public String updatetasks( @PathVariable("TaskId") String TaskId) {
        return String.format("This is the put");
    }

    @RequestMapping(value="{TaskId}",method = RequestMethod.POST)
    public String savetasks( @PathVariable("TaskId") String TaskId) {
        return String.format("This is the post");
    }

    @RequestMapping(value="{TaskId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deletetasks( @PathVariable("TaskId") String TaskId) {
        return String.format("This is the Delete");
    }
}
