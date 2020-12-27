package com.CME.APIQAapp.Questions;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="questionTable")
@Table(name = "questions")
public class QuestionEntity {
        @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	    private Integer question_id;
	    
	    @Column(name = "type", nullable = false)
	    private String type;
	    
	    @Column(name = "question", nullable = false)
	    private String question;
	 
	    public QuestionEntity() {
	  
	    }

    public Integer getQuestion_id() {
        return this.question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
        
}
