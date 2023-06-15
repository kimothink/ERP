package com.project.ERP.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.EPR.repository.CommuteRepository;
import com.project.ERP.model.Commute;


@Service
public class CommuteService {

	@Autowired
	private CommuteRepository commuteRepository;
	
	public Commute in(Commute commute)
	{
        LocalDateTime currentTime = LocalDateTime.now();
       
		commute.setStartTime(currentTime);
		return commuteRepository.save(commute);
	}
}
