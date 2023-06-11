package com.project.ERP.model;

import java.time.LocalDate;
import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Commute")
@Getter
@Setter
public class Commute {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 private LocalDate date;

	 private LocalDateTime startTime;
	 
	 private LocalDateTime endTime;

	
}
