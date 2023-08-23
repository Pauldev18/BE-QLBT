package com.pauldev.QuanLyBaiThi.service;

import com.pauldev.QuanLyBaiThi.dao.QuizReponsitory;
import com.pauldev.QuanLyBaiThi.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceImpl implements QuizService{
    private QuizReponsitory reponsitory;

    @Autowired
    public QuizServiceImpl(QuizReponsitory reponsitory) {
        this.reponsitory = reponsitory;
    }

    @Override
    public List<Quiz> findAll() {
        return reponsitory.findAll();
    }

    @Override
    public Quiz findById(int theId) {
        Optional<Quiz> result = reponsitory.findById(theId);

        Quiz theQuiz = null;
        if(result.isPresent()){
            theQuiz = result.get();
        }else{
            throw new RuntimeException("Khong tim thay id; "+theId);
        }
        return theQuiz;
    }

    @Override
    public Quiz save(Quiz quiz) {
        return  reponsitory.save(quiz);
    }

    @Override
    public void deleteById(int theId) {
        reponsitory.deleteById(theId);

    }
}
