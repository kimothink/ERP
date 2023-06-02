package com.project.ERP.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Commute")
public class Commute {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 private LocalDate date;

	 private LocalDateTime startTime;
	 
	 private LocalDateTime endTime;

	 // 생성자, 게터/세터 등 필요한 코드들
	 public Long getId() {
		 return id;
	 }

	 public void setId(Long id) {
		 this.id = id;
	 }
     
	 public LocalDate getDate() {
		 return date;
	 }

	 public void setDate(LocalDate date) {
		 this.date = date;
	 }
	 
	 public LocalDateTime getStartTime() {
		 return startTime;
	 }

	 public void setStartTime(LocalDateTime startTime) {
		 this.startTime = startTime;
	 }

	 public LocalDateTime getEndTime() {
		 return endTime;
	 }

	 public void setEndTime(LocalDateTime endTime) {
		 this.endTime = endTime;
	 }	
}
