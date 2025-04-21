package com.app.todoapp.Controller;

import com.app.todoapp.models.Task;
import com.app.todoapp.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping("/tasks")
public class TaskController {
    private final TodoService taskService;

    public TaskController(TodoService taskService) {
        this.taskService = taskService;
    }
    @GetMapping
    public String getTasks(Model model) {
        List<Task>tasks=taskService.getALLTasks();
        model.addAttribute("tasks",tasks);
        return "tasks";
    }
    @PostMapping
    public String createTasks(@RequestParam String title,@RequestParam String description) {
     if(description.equals("")||description==null){
         description="no description";
         taskService.createTask(title,description);
         return "redirect:/";
     }else{
         taskService.createTask(title,description);
         return "redirect:/";
     }
    }
    @PostMapping("/delete")
    public String deletTask(@RequestParam int id) {
        taskService.deleteTask(id);
        return "redirect:/";
    }
    @PostMapping("/toggle")
    public String toggleTask(@RequestParam int id) {
        taskService.toggeld(id);
        return "redirect:/";
    }
}
