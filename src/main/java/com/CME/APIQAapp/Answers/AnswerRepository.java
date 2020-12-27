package com.CME.APIQAapp.Answers;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

    @Transactional
    @Repository
public interface AnswerRepository extends JpaRepository<AnswerEntity, Integer>{
    
    @Query("SELECT m FROM answerTable m WHERE m.question_id=?1")
    public List<AnswerEntity> retreiveAnswerService(Integer question_id);
}
