package com.priyapritty.survey.config;

import com.priyapritty.survey.group_question_mapping.GroupQuestionMapping;
import com.priyapritty.survey.group_question_mapping.GroupQuestionMappingRepository;
import com.priyapritty.survey.groups.Groups;
import com.priyapritty.survey.groups.GroupsRepository;
import com.priyapritty.survey.options.Options;
import com.priyapritty.survey.options.OptionsRepository;
import com.priyapritty.survey.question.Question;
import com.priyapritty.survey.question.QuestionRepository;
import com.priyapritty.survey.question_type.QuestionType;
import com.priyapritty.survey.question_type.QuestionTypeRepository;
import com.priyapritty.survey.users.Users;
import com.priyapritty.survey.users.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandLineRunnerConfig {

    @Bean
    CommandLineRunner commandLineRunner(QuestionTypeRepository questionTypeRepository,
                                        QuestionRepository questionRepository,
                                        OptionsRepository optionsRepository,
                                        GroupsRepository groupsRepository,
                                        GroupQuestionMappingRepository groupQuestionMappingRepository,
                                        UsersRepository usersRepository){
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

            Options options1=new Options("ctg",question);
            optionsRepository.save(options1);

            Options options2=new Options("Barishal",question);
            optionsRepository.save(options2);

            Options options3=new Options("male",question1);
            optionsRepository.save(options3);

            Options options4=new Options("Female",question1);
            optionsRepository.save(options4);

            Groups groups1=new Groups("Covid");

            groupsRepository.save(groups1);

            Groups groups2=new Groups("Basic");
            groupsRepository.save(groups2);

            GroupQuestionMapping groupQuestionMapping =new GroupQuestionMapping(groups1,question);
            groupQuestionMappingRepository.save(groupQuestionMapping);

            GroupQuestionMapping groupQuestionMapping1 =new GroupQuestionMapping(groups1,question1);
            groupQuestionMappingRepository.save(groupQuestionMapping1);

            Users users=new Users("priya","priya@gmail.com");
            usersRepository.save(users);


        };
    }
}
