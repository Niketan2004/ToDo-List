package com.To_Do.List.ToDo.List.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.To_Do.List.ToDo.List.Entity.TodoEntity;

//Repository to call all the database rellated queries 
public interface TodoRepo extends JpaRepository<TodoEntity,Long> {
     
}
