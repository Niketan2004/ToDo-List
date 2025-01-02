package com.To_Do.List.ToDo.List.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.To_Do.List.ToDo.List.Entity.TodoEntity;
import com.To_Do.List.ToDo.List.Services.TodoService;

@Controller
@RequestMapping("/todo")
public class TodoController {
     // Todo Service is autowired to call functions
     @Autowired
     private TodoService todoService;

     // Displays Html Page to add Task
     @GetMapping("/add-task-page")
     public String page(Model model) {
          model.addAttribute("task", new TodoEntity());
          return "addTask";
     }

     // Displays Html Page to edit Task
     @GetMapping("/add-task-page/{id}")
     public String editPage(@PathVariable Long id, Model model) {
          TodoEntity todoEntity = todoService.findById(id);
          model.addAttribute("task", todoEntity);
          return "addTask";
     }

     // Displays all avaiilable tasks
     @GetMapping("/tasks")
     public String displayTasks(Model model) {
          List<TodoEntity> allTasks = todoService.displayTasks();
          model.addAttribute("Tasks", allTasks);
          return "tasks";
     }

     // Adds tasks into database
     @PutMapping("/task")
     public String addTask(@ModelAttribute TodoEntity todoEntity) {
          todoService.addTask(todoEntity);
          return "redirect:/todo/tasks";
     }

     // Edit tasks
     @PostMapping("/task")
     public String editTask(@ModelAttribute TodoEntity todoEntity) {
          todoService.addTask(todoEntity);
          return "redirect:/todo/tasks";
     }

     // Deletes task
     @DeleteMapping("/task/{id}")
     public ResponseEntity<String> deleteTask(@PathVariable Long id) {

          todoService.deleteTask(id);
          return ResponseEntity.ok().body("/todo/tasks");
     }

}
