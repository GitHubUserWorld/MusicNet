package com.musicnet.springboot.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.musicnet.springboot.model.BackingTrack;
import com.musicnet.springboot.model.CompasTrack;
import com.musicnet.springboot.model.Course;
import com.musicnet.springboot.model.Metronom;
import com.musicnet.springboot.model.Tools;
import com.musicnet.springboot.repository.BackingTrackRepository;
import com.musicnet.springboot.repository.CompasTrackRepository;
import com.musicnet.springboot.repository.CourseRepository;
import com.musicnet.springboot.repository.MetronomRepository;
import com.musicnet.springboot.repository.ToolsRepository;
import com.musicnet.springboot.repository.VideoMaterialsRepository;


@Controller
//@RequestMapping("/")
public class CoursesController {
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private MetronomRepository metronomRepository;
	@Autowired
	private BackingTrackRepository backingTrackRepository;
	@Autowired
	private VideoMaterialsRepository videoMaterialsRepository;
	@Autowired
	private ToolsRepository toolsRepository;
	@Autowired
	private CompasTrackRepository compasTrackRepository;
	

	
	//Method get, post, put and delete for courses
	@GetMapping("/courses")
	public String getCourse(Model model) {
		List<Course> listCourses = courseRepository.findAll();
		List<Metronom> listMetronoms = metronomRepository.findAll();
		List<BackingTrack> listBackingTracks= backingTrackRepository.findAll();
		List<CompasTrack> listCompasTracks= compasTrackRepository.findAll();
		model.addAttribute("title", "Cursos");
		model.addAttribute("courses", listCourses);
		model.addAttribute("course", new Course());
		model.addAttribute("metronoms", listMetronoms);
		model.addAttribute("backingtracks", listBackingTracks);
		model.addAttribute("compastracks", listCompasTracks);
		return "courses";
	}
		
	@PostMapping("/courses")
	public String createCourse(@Valid Course course, Model model) {
		courseRepository.save(course);
		List<Course> listCourses = courseRepository.findAll();
		model.addAttribute("title", "Cursos");
		model.addAttribute("courses", listCourses);
		model.addAttribute("course", new Course());
		return "redirect:/courses";
	}
	
	@PutMapping("/courses")
	public String updateCourse(@Valid Course course, Model model) {
		courseRepository.save(course);
		List<Course> listCourses = courseRepository.findAll();
		model.addAttribute("title", "Cursos");
		model.addAttribute("courses", listCourses);
		model.addAttribute("course", new Course());
		return "redirect:/courses";
	}
	
	@DeleteMapping("/courses")
	public String deleteCourse(@Valid Course course, Model model) {
		courseRepository.delete(course);
		List<Course> listCourses = courseRepository.findAll();
		model.addAttribute("title", "Cursos");
		model.addAttribute("courses", listCourses);
		model.addAttribute("course", new Course());
		return "redirect:/courses";
	}
	
	@PostMapping("/courses/tools")
	public String createTools(@Valid Tools tools, Model model) {
		toolsRepository.save(tools);
		List<Course> listCourses = courseRepository.findAll();
		List<Metronom> listMetronoms = metronomRepository.findAll();
		List<BackingTrack> listBackingTracks= backingTrackRepository.findAll();
		List<CompasTrack> listCompasTracks= compasTrackRepository.findAll();
		model.addAttribute("title", "Cursos");
		model.addAttribute("courses", listCourses);
		model.addAttribute("course", new Course());
		model.addAttribute("metronoms", listMetronoms);
		model.addAttribute("backingtracks", listBackingTracks);
		model.addAttribute("compastracks", listCompasTracks);
		return "redirect:/courses";
	}
	
	
	@GetMapping("/courses/{id}")
	public String getCourseId(@PathVariable("id") int id, Model model) {
		model.addAttribute("title", "Curso");
		model.addAttribute("course", videoMaterialsRepository.findAllByCourseId(id));
		model.addAttribute("metronoms", toolsRepository.findAllMetronomsByCourseId(id));
		model.addAttribute("compastracks", toolsRepository.findAllCompasByCourseId(id));
		model.addAttribute("backingtracks", toolsRepository.findAllBackingByCourseId(id));
		return "course";
	}
	
}
