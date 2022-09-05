package com.data.otm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.otm.model.QuestionBank;
@Repository
public interface Questionbank extends JpaRepository<QuestionBank, Integer>{

}
