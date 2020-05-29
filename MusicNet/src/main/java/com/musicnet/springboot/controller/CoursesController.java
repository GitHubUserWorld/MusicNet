package com.musicnet.springboot.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.musicnet.springboot.model.Course;
import com.musicnet.springboot.model.VideoMaterials;
import com.musicnet.springboot.repository.CourseRepository;
import com.musicnet.springboot.repository.VideoMaterialsRepository;


@Controller
//@RequestMapping("/")
public class CoursesController {
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private VideoMaterialsRepository videoMaterialsRepository;
	
	//Method get, post, put and delete for courses
	@GetMapping("/courses")
	public String getCourse(Model model) {
		List<Course> listCourses = courseRepository.findAll();
		model.addAttribute("title", "Cursos");
		model.addAttribute("courses", listCourses);
		model.addAttribute("course", new Course());
		return "courses";
	}
	
	@GetMapping("/courses/{id}")
	public String getCourseId(@PathVariable("id") int id, Model model) {
		model.addAttribute("title", "Cursos");
		model.addAttribute("course", videoMaterialsRepository.findAllByCourseId(id));
		System.out.println(videoMaterialsRepository.findAllByCourseId(id));
		return "course";
	}
	
	@PostMapping("/courses/{id}/metronom")
	public String addMetronomInCourseId(@PathVariable("id") int id, Model model) {
		return "course";
	}
	
	@PostMapping("/courses")
	public String createCourse(@Valid Course course, Model model) {
		courseRepository.save(course);
		List<Course> listCourses = courseRepository.findAll();
		model.addAttribute("title", "Cursos");
		model.addAttribute("courses", listCourses);
		model.addAttribute("course", new Course());
		return "courses";
	}
	
	@PutMapping("/courses")
	public String updateCourse(@Valid Course course, Model model) {
		courseRepository.save(course);
		List<Course> listCourses = courseRepository.findAll();
		model.addAttribute("title", "Cursos");
		model.addAttribute("courses", listCourses);
		model.addAttribute("course", new Course());
		return "courses";
	}
	
	@DeleteMapping("/courses")
	public String deleteCourse(@Valid Course course, Model model) {
		courseRepository.delete(course);
		List<Course> listCourses = courseRepository.findAll();
		model.addAttribute("title", "Cursos");
		model.addAttribute("courses", listCourses);
		model.addAttribute("course", new Course());
		return "courses";
	}
	
}
