package com.adnane.springboot.tut.todos;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
	
	private List<Todo> data = Arrays.asList(new Todo(14, "thir1253", "description2"),
			new Todo(15, "thirs2", "description3"),
			new Todo(16, "thirs3", "description5"));
	
	@GetMapping(value= {"","/"})
   public List<Todo> listTodos() {
	
		return data;
   }
}
