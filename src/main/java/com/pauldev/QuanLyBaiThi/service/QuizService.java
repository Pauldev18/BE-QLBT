package com.pauldev.QuanLyBaiThi.service;

import com.pauldev.QuanLyBaiThi.entity.Quiz;

import java.util.List;

public interface QuizService {
    List<Quiz> findAll();
    Quiz findById(int theId);
    Quiz save(Quiz quiz);
    void deleteById(int theId);

}
