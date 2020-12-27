package com.CME.APIQAapp.Questions;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    @Autowired
    QuestionRepository questionRepository;
    
    @Autowired
    QuestionServiceImpl questionService;
    
	// First endpoint: Returns all questions we have in database
	@GetMapping("/get-all-questions")
	  public List<QuestionEntity> getAllQuestions(){
      List<QuestionEntity> allQuestionlist = questionRepository.findAll();
      return allQuestionlist;
    }

  // Second endpoint: Returns a single question, provided its ID (question_id)  
  @GetMapping("/get-question/{id}")
	public QuestionEntity getQuestionbyId(@PathVariable(value = "id") Integer question_id){
		QuestionEntity questionEntity = questionRepository.findById(question_id).get();
		return questionEntity;	
  }

  // Third endpoint: Returns all questions for a specific type (History, Gaming, Science, Coding)
  @GetMapping("/get-questions/{type}")
	public List<QuestionEntity> getQuestionbyType(@PathVariable(value = "type") String type){
		List<QuestionEntity> questionEntity = questionRepository.findByType(type);
		return questionEntity;	
  }

  // Fourth endpoint: Creates a new question, provided information in request body
  @PostMapping("/create-question")
  public QuestionEntity createQuestion(@RequestBody QuestionEntity question){
    QuestionEntity savedQuestion = questionRepository.save(question);
    return savedQuestion;
  }

  // Fifth endpoint: returns all questions based on users' search
  @GetMapping("/search")
	public List<QuestionEntity> searchQuestionService(@RequestParam(value = "ques") String ques){
		List<QuestionEntity> questionEntity = questionService.searchQuestionController(ques.toLowerCase()); // for case insensitive searching
		return questionEntity;	
    }
}