package com.priyapritty.survey.config;

import com.priyapritty.survey.answer.Answer;
import com.priyapritty.survey.answer.AnswerRepository;
import com.priyapritty.survey.group_question_mapping.GroupQuestionMapping;
import com.priyapritty.survey.group_question_mapping.GroupQuestionMappingRepository;
import com.priyapritty.survey.group.Group;
import com.priyapritty.survey.group.GroupRepository;
import com.priyapritty.survey.option.Option;
import com.priyapritty.survey.option.OptionRepository;
import com.priyapritty.survey.question.Question;
import com.priyapritty.survey.question.QuestionRepository;
import com.priyapritty.survey.question_type.QuestionType;
import com.priyapritty.survey.question_type.QuestionTypeRepository;
import com.priyapritty.survey.user.User;
import com.priyapritty.survey.user.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandLineRunnerConfig {

    @Bean
    CommandLineRunner commandLineRunner(QuestionTypeRepository questionTypeRepository,
                                        QuestionRepository questionRepository,
                                        OptionRepository optionRepository,
                                        GroupRepository groupRepository,
                                        GroupQuestionMappingRepository groupQuestionMappingRepository,
                                        UserRepository userRepository, AnswerRepository answerRepository){
        return args -> {
            QuestionType questionType1=new QuestionType ("multiple");
            questionTypeRepository.save(questionType1);

            QuestionType questionType2=new QuestionType ("text");
            System.out.println("question 2: " + questionType2.getId());

            questionTypeRepository.save(questionType2);

            System.out.println("question 2: " + questionType2.getId());

            Question question=new Question ("city?", questionType2);
            questionRepository.save(question);

            Question question1=new Question ("gender?", questionType1);
            questionRepository.save(question1);

            Option options1=new Option("ctg",question);
            optionRepository.save(options1);

            Option option2=new Option("Barishal",question);
            optionRepository.save(option2);

            Option option3=new Option("male",question1);
            optionRepository.save(option3);

            Option option4=new Option("Female",question1);
            optionRepository.save(option4);

            Group group1 =new Group("Covid");
            groupRepository.save(group1);

            Group group2 =new Group("Basic");
            groupRepository.save(group2);

            GroupQuestionMapping groupQuestionMapping =new GroupQuestionMapping(group1,question);
            groupQuestionMappingRepository.save(groupQuestionMapping);

            GroupQuestionMapping groupQuestionMapping1 =new GroupQuestionMapping(group1,question1);
            groupQuestionMappingRepository.save(groupQuestionMapping1);

            User user1=new User("priya","priya@gmail.com");
            userRepository.save(user1);

            User user2=new User("pritty","pritty@gmail.com");
            userRepository.save(user2);


            Answer answer=new Answer("male",user1, group1,question1);
            answerRepository.save(answer);

            Answer answer1=new Answer("ctg",user2, group2,question);
            answerRepository.save(answer1);

        };
    }
}
