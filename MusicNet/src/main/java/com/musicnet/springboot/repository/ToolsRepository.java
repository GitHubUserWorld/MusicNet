package com.musicnet.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.musicnet.springboot.model.Metronom;
import com.musicnet.springboot.model.Tools;


@Repository
public interface ToolsRepository extends JpaRepository<Tools, Integer>{
	
	//@Query(value = "SELECT file FROM musicnet.metronom where velocity = ANY (SELECT velocity FROM musicnet.tools WHERE courseid = ?1)", nativeQuery = true)
	@Query(value = "SELECT file FROM musicnet.metronom m,  musicnet.tools t WHERE t.courseid = ?1 and (t.metronom1 = m.velocity or t.metronom2 = m.velocity or t.metronom3 = m.velocity or t.metronom4 = m.velocity or t.metronom5 = m.velocity or t.metronom6 = m.velocity or t.metronom7 = m.velocity)", nativeQuery = true)
	List<String> findAllMetronomsByCourseId(int courseId);
	
	@Query(value = "SELECT file FROM musicnet.compastrack c,  musicnet.tools t WHERE t.courseid = ?1 and (t.compastrackname1 = c.name and t.compastrackvelocity1 = c.velocity) or (t.compastrackname2 = c.name and t.compastrackvelocity2 = c.velocity) or (t.compastrackname3 = c.name and t.compastrackvelocity3 = c.velocity)", nativeQuery = true)
	List<String> findAllCompasByCourseId(int courseId);
	
	@Query(value = "SELECT file FROM musicnet.backingtrack b,  musicnet.tools t WHERE t.courseid = ?1 and (t.backingtrackname1 = b.name and t.backingtrackvelocity1 = b.velocity) or (t.backingtrackname2 = b.name and t.backingtrackvelocity2 = b.velocity) or (t.backingtrackname3 = b.name and t.backingtrackvelocity3 = b.velocity)", nativeQuery = true)
	List<String> findAllBackingByCourseId(int courseId);


}
