package com.tgroy.repository;

import java.util.List;

import com.tgroy.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}