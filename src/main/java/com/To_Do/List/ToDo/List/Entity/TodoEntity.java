package com.To_Do.List.ToDo.List.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Todo_List")
public class TodoEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long Id;    // Autogenerated Id stored in database
     @NotNull
     private String title;    // Task title that should not be NULL 
     @Lob
     private String description;        //brief description of task
     //private String preference;
}
