package com.example.demo.app.task;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class TaskForm {

	@Digits(integer = 1, fraction = 0)
	private int typeId;

	@NotBlank(message = "タイトルを入力してください。")
	@Size(min = 1, max = 20, message = "20文字以内で入力してください")
	private String title;

	@NotBlank(message = "内容を入力してください。")
	private String detail;

	@NotBlank(message = "期限を設定してください。")
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	@Future(message = "期限が過去に設定されています。")
	private LocalDateTime deadline;

	public TaskForm() {
	}

	public TaskForm(@Digits(integer = 1, fraction = 0) int typeId,
			@NotBlank(message = "タイトルを入力してください。") @Size String title, @NotBlank(message = "内容を入力してください。") String detail,
			@NotBlank(message = "期限を設定してください。") @Future(message = "期限が過去に設定されています。") LocalDateTime deadline,
			boolean isNewTask) {
		this.typeId = typeId;
		this.title = title;
		this.detail = detail;
		this.deadline = deadline;
		this.isNewTask = isNewTask;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public LocalDateTime getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDateTime deadline) {
		this.deadline = deadline;
	}

	public boolean isNewTask() {
		return isNewTask;
	}

	public void setNewTask(boolean isNewTask) {
		this.isNewTask = isNewTask;
	}

	public boolean isNewTask;

}
