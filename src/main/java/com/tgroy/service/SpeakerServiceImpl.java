package com.tgroy.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgroy.model.Speaker;
import com.tgroy.repository.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

	@Autowired
	private SpeakerRepository repository;

	public SpeakerServiceImpl() {
		System.out.println("SpeakerServiceImpl no args constructor");
	}

	// Constructor injection
//	@Autowired
//	public SpeakerServiceImpl(SpeakerRepository repository) {
//		System.out.println("SpeakerServiceImpl repository constructor");
//		this.repository = repository;
//	}

	// Setter injection
//	@Autowired
//	public void setRepository(SpeakerRepository repository) {
//		System.out.println("SpeakerServiceImpl setter");
//		this.repository = repository;
//	}

	@PostConstruct
	private void initialize() {
		System.out.println("We're called after constructors");
	}

	@PreDestroy
	private void preDestroy() {
		System.out.println("We're called at the end");
	}

	@Override
	public List<Speaker> findAll() {
		return repository.findAll();
	}

}
