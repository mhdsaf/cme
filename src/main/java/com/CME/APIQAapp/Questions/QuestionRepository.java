package com.CME.APIQAapp.Questions;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

    @Repository
public interface QuestionRepository extends JpaRepository<QuestionEntity, Integer>{
    
    public List<QuestionEntity> findByType(String type);

    @Query("SELECT m FROM questionTable m WHERE lower(m.question) LIKE %:question%")
    public List<QuestionEntity> searchQuestionService(@Param("question") String question);

}
