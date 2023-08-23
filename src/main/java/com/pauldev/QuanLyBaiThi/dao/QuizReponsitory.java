package com.pauldev.QuanLyBaiThi.dao;

import com.pauldev.QuanLyBaiThi.entity.Quiz;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizReponsitory extends  JpaRepository<Quiz, Integer> {
}
