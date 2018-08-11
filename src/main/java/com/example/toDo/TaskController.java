package com.example.toDo;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaskController {

    @ResponseBody // Nie zwracaj html'a tylko Stringa
    @PostMapping("/tasks")
    public String create(@RequestParam String name,
                         @RequestParam String description,
                         @RequestParam(required = false) boolean finished,
                         ModelMap modelMap // udostepnia widok elementów ?
    ){
        Task task = new Task(name,description,finished);
        modelMap.put("task",task);
        return "added" + task;
    }

    @GetMapping("/")
    public String add(){
        return "add";
    }
}
