package com.musicnet.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.musicnet.springboot.model.BackingTrack;

@Repository
public interface BackingTrackRepository extends JpaRepository<BackingTrack, Integer>{

}
