package com.priyapritty.survey.question_type;

import com.priyapritty.survey.question.Question;
import com.priyapritty.survey.question.QuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuestionTypeConfig {

    @Bean
    CommandLineRunner commandLineRunner(QuestionTypeRepository questionTypeRepository,
                                        QuestionRepository questionRepository){
        return args -> {
            QuestionType questionType1=new QuestionType ("multiple");
            questionTypeRepository.save(questionType1);

            QuestionType questionType2=new QuestionType ("text");
            System.out.println("question 2: " + questionType2.getId());

            questionTypeRepository.save(questionType2);

            System.out.println("question 2: " + questionType2.getId());

            Question question=new Question ("city?", questionType2);
            questionRepository.save(question);
        };
    }
}
