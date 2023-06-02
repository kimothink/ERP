package com.project.ERP.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.project.EPR.repository.CommuteRepository;
import com.project.ERP.model.Commute;


@Controller
@RequestMapping("/commute")
public class CommuteController {
	
//	 @Autowired
//	 CommuteRepository commuteRepository;
//	
	@PostMapping("/in")
	@ResponseBody
    public String InAPI() {
		
//		Commute commute  = new Commute();
//        LocalDate currentDate = LocalDate.now();
//        LocalDateTime currentDateTime = LocalDateTime.now();
//        
//        commute.setDate(currentDate);
//        commute.setStartTime(currentDateTime);
//        commute.setEndTime(null);
//        commuteRepository.save(commute);
//        
        return "API response";
    }
	
	@PostMapping("/out")
	@ResponseBody
    public String OutAPI() {
            return "API response";
    }
}
