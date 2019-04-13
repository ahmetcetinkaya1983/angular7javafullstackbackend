package com.example.demo.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "Ahmet", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "Ahmet", "Learn to Code", new Date(), false));
		todos.add(new Todo(++idCounter, "Ahmet", "Move to London", new Date(), false));
		todos.add(new Todo(++idCounter, "Ahmet", "Find a Job in the UK", new Date(), false));
	}
	
	public List<Todo> findAll() {
		return todos;
	}

}
