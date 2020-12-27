package com.CME.APIQAapp.Answers;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="answerTable")
@Table(name = "answers")
public class AnswerEntity {
    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	    private Integer answer_id;
	    
	    @Column(name = "question_id", nullable = false)
	    private Integer question_id;
	    
	    @Column(name = "answer", nullable = false)
	    private String answer;
	 
	    public AnswerEntity() {
	  
	    }
	 
	    public AnswerEntity(String answer, Integer question_id) {
	         this.answer = answer;
	         this.question_id = question_id;
        }

    public Integer getAnswer_id() {
        return this.answer_id;
    }

    public void setAnswer_id(Integer answer_id) {
        this.answer_id = answer_id;
    }

    public Integer getQuestion_id() {
        return this.question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
        
}
