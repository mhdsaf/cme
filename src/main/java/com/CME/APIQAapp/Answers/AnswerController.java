package com.CME.APIQAapp.Answers;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/answer")
public class AnswerController {
    @Autowired
    AnswerRepository answerRepository;
    
    @Autowired
    AnswerServiceImpl answerService;
    
	
	@GetMapping("/get-all-answers")
	public List<AnswerEntity> getAllAnswers(){
		List<AnswerEntity> allAnswerlist = answerRepository.findAll();
		return allAnswerlist;
    }

    @PostMapping("/create-answer")
    public AnswerEntity createAnswer(@RequestBody AnswerEntity answer) {
        AnswerEntity savedAnswer = answerRepository.save(answer);
    	  return savedAnswer;
    }
  @GetMapping("/specific-answers/{quesId}")
	public List<AnswerEntity> getQuestionbyType(@PathVariable(value = "quesId") Integer question_id)
	{
		List<AnswerEntity> answerEntity = answerService.retreiveAnswerController(question_id);
		
		return answerEntity;	
    }
}
