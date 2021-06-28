package com.giullianogazzoni.school.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giullianogazzoni.school.repository.AulaRepository;

@Service
public class AulaService {
	
	@Autowired
	AulaRepository aulaRepository;

}
