package com.training.center.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.center.dto.TrainingCenter;
import com.training.center.service.TrainingService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/training")
public class TrainingController {
	
	@Autowired
	private TrainingService trainingService;
	
	@PostMapping("/save")
	public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
	    TrainingCenter savedTrainingCenter = trainingService.createTrainingCenter(trainingCenter);
	    return new ResponseEntity<>(savedTrainingCenter, HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
	    List<TrainingCenter> trainingCenters = trainingService.getAllTrainingCenters();
	    return new ResponseEntity<>(trainingCenters, HttpStatus.OK);
	}
	
	
	

}
