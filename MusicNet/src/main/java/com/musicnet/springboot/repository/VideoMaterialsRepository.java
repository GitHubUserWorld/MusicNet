package com.musicnet.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.musicnet.springboot.model.VideoMaterials;
import java.util.List;




@Repository
public interface VideoMaterialsRepository extends JpaRepository<VideoMaterials, String>{
	
	@Query(value = "SELECT * FROM musicnet.videomaterials WHERE idmaterials = ?1", nativeQuery = true)
    List<VideoMaterials> findAllByCourseId(int courseId);
	

}
