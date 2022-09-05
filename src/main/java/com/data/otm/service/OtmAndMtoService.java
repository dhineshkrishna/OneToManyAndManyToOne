package com.data.otm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.otm.model.QuestionBank;
import com.data.otm.repo.Questionbank;

@Service
public class OtmAndMtoService {
@Autowired
Questionbank questionbank;

	public List<QuestionBank> getdata() {
		return questionbank.findAll();
	}

	public Optional<QuestionBank> getdatas(int id) {
		
		return questionbank.findById(id);
	}

	public String postdata(QuestionBank bank) {
		questionbank.save(bank);
		return "Posted succesfully";
	}

}
