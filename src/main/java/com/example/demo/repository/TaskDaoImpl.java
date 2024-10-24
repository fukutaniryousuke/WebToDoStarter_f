package com.example.demo.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Task;

@Repository
public class TaskDaoImpl implements TaskDao {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public TaskDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Task> findAll() {
		
		String sql = "SELECT task.id, user_id, type_id, title, detail, deadline,"
				+ "type, comment FROM task"
				+ "INNER JOIN task_type ON task.type_id = task_type.id";
		
		//タスク一覧をMapのListで取得
		List<Map<String,Object>> resultList = null;
		
		//return用の空のListを用意
		List<Task> list = null;
		
		//二つのテーブルのデータをTaskにまとめる
		for(Map<String,Object> result : resultList) {
			Task task = new Task();
		}
		return null;
	}

	@Override
	public Optional<Task> findById(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return Optional.empty();
	}

	@Override
	public int update(Task task) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public int deleteById(int id) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
