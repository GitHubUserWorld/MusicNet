package com.musicnet.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicnet.springboot.model.CompasTrack;
import com.musicnet.springboot.model.Instrument;
import com.musicnet.springboot.model.Style;

@Repository
public interface CompasTrackRepository extends JpaRepository<CompasTrack, Integer>{

}
