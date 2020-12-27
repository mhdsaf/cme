package com.CME.APIQAapp.Answers;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AnswerServiceImpl {
    @Autowired
    private AnswerRepository answerRepository;

    public List<AnswerEntity> retreiveAnswerController(Integer question_id){
        return answerRepository.retreiveAnswerService(question_id);
    }
    
}
