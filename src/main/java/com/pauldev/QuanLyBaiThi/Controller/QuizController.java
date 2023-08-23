package com.pauldev.QuanLyBaiThi.Controller;

import com.pauldev.QuanLyBaiThi.entity.Quiz;
import com.pauldev.QuanLyBaiThi.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizs")
public class QuizController {
    private QuizService service;
    @Autowired
    public QuizController(QuizService service) {
        this.service = service;
    }
    @GetMapping("/quiz/{quizId}")
    public Quiz findById(@PathVariable int quizId){
        Quiz quiz = service.findById(quizId);
        if(quiz == null)
        {
            throw new RuntimeException("Not found");
        }
        return quiz;
    }
    @PostMapping("/quiz")
    public ResponseEntity<Quiz> newQuiz(@RequestBody Quiz thequiz)
    {
        Quiz save = service.save(thequiz);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }
}
