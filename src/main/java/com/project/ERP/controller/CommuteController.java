package com.project.ERP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/commute")
public class CommuteController {
	
	@PostMapping("/in")
	@ResponseBody
    public String InAPI() {
	
            return "API response";
    }
	
	@PostMapping("/out")
	@ResponseBody
    public String OutAPI() {
            return "API response";
    }
}
