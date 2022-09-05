package com.data.otm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.data.otm.model.Questions;
@Repository
public interface Question extends JpaRepository<Questions, Integer> {

}
