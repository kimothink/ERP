package com.project.ERP.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import com.project.ERP.model.Commute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.project.EPR.repository.CommuteRepository;


@Controller
@RequestMapping("/commute")
public class CommuteController {
	
	@Autowired
 	private CommuteRepository commuteRepository;
	
	@PostMapping("/in")
	@ResponseBody
    public String InAPI() {
        return "출근";
    }
	
	@PostMapping("/out")
	@ResponseBody
    public String OutAPI() {
            return "퇴근";
    }
}
