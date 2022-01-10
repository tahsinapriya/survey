package com.priyapritty.survey.group_question_mapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupQuestionMappingRepository extends JpaRepository<GroupQuestionMapping,Long> {

}


