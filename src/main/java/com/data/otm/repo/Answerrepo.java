package com.data.otm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.otm.model.Answer;
@Repository
public interface Answerrepo extends JpaRepository<Answer, Integer>{

}
