package com.training.center.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.center.dto.TrainingCenter;
import com.training.center.repository.TrainingRepository;

import jakarta.validation.Valid;

@Service
public class TrainingService {
	
	@Autowired
	private TrainingRepository trainingRepository;

	public TrainingCenter createTrainingCenter(@Valid TrainingCenter trainingCenter) {
		return trainingRepository.save(trainingCenter);
	}

	public List<TrainingCenter> getAllTrainingCenters() {
		return trainingRepository.findAll();
	}

	

}
