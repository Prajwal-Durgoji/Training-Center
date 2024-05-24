package com.training.center.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.center.dto.TrainingCenter;

public interface TrainingRepository extends JpaRepository<TrainingCenter, Long> {

}
