package com.project.ERP.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.EPR.repository.CommuteRepository;
import com.project.ERP.model.Commute;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/commute")
public class CommuteController {
	
	@Autowired
	private CommuteRepository commuteRepository;
	
	@PostMapping("/in")
	@ResponseBody
    public String InAPI() {
		
		LocalDateTime currentTime = LocalDateTime.now();
	     
		Commute commute = new Commute();
		commute.setStartTime(currentTime);
		commuteRepository.save(commute);
		return "출근";
    }
	
	@PostMapping("/out")
	@ResponseBody
    public String OutAPI() {
            return "퇴근";
    }
}
