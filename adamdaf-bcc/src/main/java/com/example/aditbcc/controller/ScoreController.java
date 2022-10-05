package com.example.aditbcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aditbcc.model.Score;
import com.example.aditbcc.service.ScoreService;

@CrossOrigin
@RestController
@RequestMapping("/api/score")
public class ScoreController {
	@Autowired
	ScoreService scoreService;
	
	@GetMapping
	public List<Score>getScores(){
		return scoreService.getAllScore();
	}
}
