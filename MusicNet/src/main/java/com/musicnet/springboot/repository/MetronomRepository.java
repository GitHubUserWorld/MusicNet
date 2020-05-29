package com.musicnet.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.musicnet.springboot.model.Metronom;


@Repository
public interface MetronomRepository extends JpaRepository<Metronom, Integer>{

}
