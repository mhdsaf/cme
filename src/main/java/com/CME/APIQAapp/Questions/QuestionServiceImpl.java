package com.CME.APIQAapp.Questions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QuestionServiceImpl {

    @Autowired
    private QuestionRepository questionRepository;

    public List<QuestionEntity> searchQuestionController(String question){
        return questionRepository.searchQuestionService(question);
    }
}
