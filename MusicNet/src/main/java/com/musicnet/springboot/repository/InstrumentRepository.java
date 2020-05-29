package com.musicnet.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicnet.springboot.model.Instrument;


@Repository
public interface InstrumentRepository extends JpaRepository<Instrument, Long>{
	
}
