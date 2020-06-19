package com.musicnet.springboot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


import com.musicnet.springboot.model.BackingTrack;
import com.musicnet.springboot.model.CompasTrack;
import com.musicnet.springboot.model.Instrument;
import com.musicnet.springboot.model.Metronom;
import com.musicnet.springboot.model.Style;
import com.musicnet.springboot.repository.StyleRepository;
import com.musicnet.springboot.repository.BackingTrackRepository;
import com.musicnet.springboot.repository.CompasTrackRepository;
import com.musicnet.springboot.repository.InstrumentRepository;
import com.musicnet.springboot.repository.MetronomRepository;

@Controller
//@RequestMapping("/")
public class SystemAdministratorController {
	@Autowired
	private StyleRepository styleRepository;
	@Autowired
	private InstrumentRepository instrumentRepository;
	@Autowired
	private MetronomRepository metronomRepository;
	@Autowired
	private BackingTrackRepository backingTrackRepository;
	@Autowired
	private CompasTrackRepository compasTrackRepository;
	
	//Method get for index.html
	@GetMapping("/")
	public String getRoot() {
		return "index";
	}
	
	//Method get, post, put and delete for music styles
	@GetMapping("/musicalstyle")
	public String getStyle(Model model) {
		List<Style> listStyles = styleRepository.findAll();
		model.addAttribute("title", "Estilos musicales");
		model.addAttribute("styles", listStyles);
		model.addAttribute("style", new Style());
		return "musicalstyle";
	}
	
	@PostMapping("/musicalstyle")
	public String createMusicalstyle(@Valid Style style, Model model) {
		styleRepository.save(style);
		List<Style> listStyles = styleRepository.findAll();
		model.addAttribute("title", "Estilos musicales");
		model.addAttribute("styles", listStyles);
		model.addAttribute("style", new Style());
		return "musicalstyle";
		}
	
	@PutMapping("/musicalstyle")
	public String updateStyle(@Valid Style style, Model model) {
		styleRepository.save(style);
		List<Style> listStyles = styleRepository.findAll();
		model.addAttribute("title", "Estilos musicales");
		model.addAttribute("styles", listStyles);
		model.addAttribute("style", new Style());
		return "musicalstyle";
		}
		
	@DeleteMapping("/musicalstyle")
	public String deleteStyle(@Valid Style style, Model model) {
		styleRepository.delete(style);
		List<Style> listStyles = styleRepository.findAll();
		model.addAttribute("title", "Estilos musicales");
		model.addAttribute("styles", listStyles);
		model.addAttribute("style", new Style());
		return "musicalstyle";
	}
	
	
	//Method get, post, put and delete for music instruments
	@GetMapping("/instruments")
	public String getInstrument(Model model) {
		List<Instrument> listInstruments = instrumentRepository.findAll();
		model.addAttribute("title", "Instrumentos");
		model.addAttribute("instruments", listInstruments);
		model.addAttribute("instrument", new Instrument());
		return "instruments";
	}
	
	@PostMapping("/instruments")
	public String createInstrument(@Valid Instrument instrument, Model model) {
		instrumentRepository.save(instrument);
		List<Instrument> listInstruments = instrumentRepository.findAll();
		model.addAttribute("title", "Instrumentos");
		model.addAttribute("instruments", listInstruments);
		model.addAttribute("instrument", new Instrument());
		return "instruments";
		}
	
	@PutMapping("/instruments")
	public String updateInstrument(@Valid Instrument instrument, Model model) {
		instrumentRepository.save(instrument);
		List<Instrument> listInstruments = instrumentRepository.findAll();
		model.addAttribute("title", "Instrumentos");
		model.addAttribute("instruments", listInstruments);
		model.addAttribute("instrument", new Instrument());
		return "instruments";
	}
	
	@DeleteMapping("/instruments")
	public String deleteInstrument(@Valid Instrument instrument, Model model) {
		instrumentRepository.delete(instrument);
		List<Instrument> listInstruments = instrumentRepository.findAll();
		model.addAttribute("title", "Instrumentos");
		model.addAttribute("instruments", listInstruments);
		model.addAttribute("instrument", new Instrument());
		return "instruments";
	}
	
	
	//Method get, post, put and delete for metronom
	@GetMapping("/metronoms")
	public String getMetronom(Model model) {
		List<Metronom> listMetronoms = metronomRepository.findAll();;
		model.addAttribute("title", "Metronomos");
		model.addAttribute("metronoms", listMetronoms);
		model.addAttribute("metronom", new Metronom());
		return "metronoms";
	}
	
	@PostMapping("/metronoms")
	public String addMetronom(@Valid Metronom metronom, Model model) {
		metronomRepository.save(metronom);
		List<Metronom> listMetronoms = metronomRepository.findAll();;
		model.addAttribute("title", "Metronomos");
		model.addAttribute("metronoms", listMetronoms);
		model.addAttribute("metronom", new Metronom());
		return "metronoms";
		
	}
	
	@PutMapping("/metronoms")
	public String updateMetronom(@Valid Metronom metronom, Model model) {
		metronomRepository.save(metronom);
		List<Metronom> listMetronoms = metronomRepository.findAll();
		model.addAttribute("title", "Metronomos");
		model.addAttribute("metronoms", listMetronoms);
		model.addAttribute("metronom", new Metronom());
		return "metronoms";
	}
	
	@DeleteMapping("/metronoms")
	public String deleteMetronom(@Valid Metronom metronom, Model model) {
		metronomRepository.delete(metronom);
		List<Metronom> listMetronoms = metronomRepository.findAll();
		model.addAttribute("title", "Metronomos");
		model.addAttribute("metronoms", listMetronoms);
		model.addAttribute("metronom", new Metronom());
		return "metronoms";
	}
	
	//Method get, post, put and delete for compas track
	@GetMapping("/compastracks")
	public String getCompasTrack(Model model) {
		List<CompasTrack> listCompasTrack = compasTrackRepository.findAll();
		model.addAttribute("title", "Bases de compas");
		model.addAttribute("compastracks", listCompasTrack);
		model.addAttribute("compastrack", new CompasTrack());
		return "compastrack";
	}
	
	@PostMapping("/compastracks")
	public String addCompasTrack(@Valid CompasTrack compastrack, Model model) {
		compasTrackRepository.save(compastrack);
		List<CompasTrack> listCompasTrack = compasTrackRepository.findAll();
		model.addAttribute("title", "Bases de compas");
		model.addAttribute("compastracks", listCompasTrack);
		model.addAttribute("compastrack", new CompasTrack());
		return "compastrack";
		
	}
	
	@PutMapping("/compastracks")
	public String updateCompasTrack(@Valid CompasTrack compastrack, Model model) {
		compasTrackRepository.save(compastrack);
		List<CompasTrack> listCompasTrack = compasTrackRepository.findAll();
		model.addAttribute("title", "Bases de compas");
		model.addAttribute("compastracks", listCompasTrack);
		model.addAttribute("compastrack", new CompasTrack());
		return "compastrack";
	}
	
	@DeleteMapping("/compastracks")
	public String deleteCompasTrack(@Valid CompasTrack compastrack, Model model) {
		compasTrackRepository.delete(compastrack);
		List<CompasTrack> listCompasTrack = compasTrackRepository.findAll();
		model.addAttribute("title", "Bases de compas");
		model.addAttribute("compastracks", listCompasTrack);
		model.addAttribute("compastrack", new CompasTrack());
		return "compastrack";
	}
	
	
	//Method get, post, put and delete for backing track
	@GetMapping("/backingtracks")
	public String getBackingTrack(Model model) {
		List<BackingTrack> listBackingTrack = backingTrackRepository.findAll();
		model.addAttribute("title", "Bases de acompañamiento");
		model.addAttribute("backingtracks", listBackingTrack);
		model.addAttribute("bakingtrack", new BackingTrack());
		return "backingtrack";
	}
	
	@PostMapping("/backingtracks")
	public String addBackingTrack(@Valid BackingTrack backingtrack, Model model) {
		backingTrackRepository.save(backingtrack);
		List<BackingTrack> listBackingTrack = backingTrackRepository.findAll();
		model.addAttribute("title", "Bases de acompañamiento");
		model.addAttribute("backingtracks", listBackingTrack);
		model.addAttribute("bakingtrack", new BackingTrack());
		return "backingtrack";
		
	}
	
	@PutMapping("/backingtracks")
	public String updateBackingTrack(@Valid BackingTrack backingtrack, Model model) {
		List<BackingTrack> listBackingTrack = backingTrackRepository.findAll();
		model.addAttribute("title", "Bases de acompañamiento");
		model.addAttribute("backingtracks", listBackingTrack);
		model.addAttribute("bakingtrack", new BackingTrack());
		return "backingtrack";
	}
	
	@DeleteMapping("/backingtracks")
	public String deleteBackingTrack(@Valid BackingTrack backingtrack, Model model) {
		backingTrackRepository.delete(backingtrack);
		List<BackingTrack> listBackingTrack = backingTrackRepository.findAll();
		model.addAttribute("title", "Bases de acompañamiento");
		model.addAttribute("backingtracks", listBackingTrack);
		model.addAttribute("bakingtrack", new BackingTrack());
		return "backingtrack";
	}


}
