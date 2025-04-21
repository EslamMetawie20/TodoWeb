package com.app.todoapp.services;


import com.app.todoapp.models.Task;
import com.app.todoapp.repository.TaskRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private final TaskRepo taskRepo;

    public TodoService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    public List<Task> getALLTasks() {
         return taskRepo.findAll();
    }

    public void createTask(String title, String description) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(description);
       // task.setIscompleted(false);
        taskRepo.save(task);
    }

    public void deleteTask(int id) {
        Task task=new Task();
        task.setId(id);
        taskRepo.delete(task);
    }

    public void toggeld(int id) {
        Task task=taskRepo.findById(id).orElse(null);
        if(task!=null){
            task.setIscompleted(!task.isIscompleted());
            taskRepo.save(task);
        }
    }
}
