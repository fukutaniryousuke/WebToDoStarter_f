package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Task;

public interface TaskDao {
	
	List<Task> findAll();

	Optional<Task> findById(int id);

	int update(Task task);
	
	int deleteById(int id);
}
