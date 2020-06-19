package com.musicnet.springboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassRoomsController {

	@GetMapping("/classrooms")
	public String getClassroom(Model model) {
		model.addAttribute("title", "Aulas");
		return "classrooms";
	}

	
}
