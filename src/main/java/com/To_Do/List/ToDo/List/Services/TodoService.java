package com.To_Do.List.ToDo.List.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.To_Do.List.ToDo.List.Entity.TodoEntity;
import com.To_Do.List.ToDo.List.Repository.TodoRepo;

@Service
public class TodoService {
     @Autowired
     private TodoRepo todoRepo;

     // adds task in database aswell as edit it...
     // If id of the task is provided then it will edit the task if not then adds it in the database
     public ResponseEntity<TodoEntity> addTask(TodoEntity todoEntity) {
          return ResponseEntity.status(HttpStatus.CREATED).body(todoRepo.save(todoEntity));
     }

     // display tasks
     public List<TodoEntity> displayTasks() {
          return todoRepo.findAll();
     }

     // delete task
     public void deleteTask(Long id) {
          if (todoRepo.findById(id) != null) {
               todoRepo.deleteById(id);
          }
     }
     // Finds the task by there id
     public TodoEntity findById(Long id) {
          return todoRepo.findById(id).get();
     }
}
