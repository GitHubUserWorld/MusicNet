package com.musicnet.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.musicnet.springboot.model.Style;
import com.sun.xml.bind.v2.model.core.ID;

@Repository
public interface StyleRepository extends JpaRepository<Style, String>{
	

}
