package com.data.otm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.data.otm.model.QuestionBank;
import com.data.otm.service.OtmAndMtoService;

@RestController
public class MainController {
@Autowired
OtmAndMtoService service;

	@GetMapping("/get")
	public List<QuestionBank> get(){
		return service.getdata();
	}
	
	@PostMapping("/post")
	public String post(@RequestBody QuestionBank bank) {
		return service.postdata(bank);
	}
	
	@GetMapping("/getvalue/{id}")
	public Optional<QuestionBank> getdata(@PathVariable ("id") int id) {
		return service.getdatas(id);
	}
}
