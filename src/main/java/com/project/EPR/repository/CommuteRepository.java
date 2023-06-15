package com.project.EPR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ERP.model.Commute;

@Repository
public interface CommuteRepository extends JpaRepository<Commute, Integer>{

}
