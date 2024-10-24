package com.tao.digital.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tao.digital.task.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

