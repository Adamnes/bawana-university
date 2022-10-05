package com.example.aditbcc.service;

import java.util.List;

import com.example.aditbcc.model.Score;
import com.example.aditbcc.model.Student;

public interface ScoreService {
	public List<Score>getAllScore();
	public String addScore(Score score);
}
