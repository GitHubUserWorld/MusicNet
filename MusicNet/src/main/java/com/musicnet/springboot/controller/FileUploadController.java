package com.musicnet.springboot.controller;

import java.io.IOException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.musicnet.springboot.exception.StorageFileNotFoundException;
import com.musicnet.springboot.model.Course;
import com.musicnet.springboot.model.Style;
import com.musicnet.springboot.model.VideoMaterials;
import com.musicnet.springboot.repository.VideoMaterialsRepository;
import com.musicnet.springboot.service.StorageService;

import com.google.api.services.samples.youtube.cmdline.data.*;

@Controller
public class FileUploadController {

	@Autowired
	StorageService storageService;
	
	@Autowired
	VideoMaterialsRepository videoMaterialsRepository;

	@Autowired
	public FileUploadController() { //StorageService storageService
		//this.videoMaterialsRepository = null;
		//this.storageService = storageService;
	}

	@GetMapping("/files")
	public String listUploadedFiles(Model model) throws IOException {
		//model.addAttribute("message", "Hola Jonathan!");
		//model.addAttribute("files", storageService.loadAll().map(
		//		path -> MvcUriComponentsBuilder.fromMethodName(FileUploadController.class,
		//				"serveFile", path.getFileName().toString()).build().toUri().toString())
		//		.collect(Collectors.toList()));
		
		model.addAttribute("file", storageService.load("nada"));

		return "uploadForm";
	}

	@GetMapping("/files/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> serveFile(@PathVariable String filename) {

		Resource file = storageService.loadAsResource(filename);
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
				"attachment; filename=\"" + file.getFilename() + "\"").body(file);
	}

	@PostMapping("/files")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, VideoMaterials videoMaterials, Model model) {
		System.out.println(videoMaterials.getidmaterials());
		System.out.println(videoMaterials.getVideo());
		System.out.println(videoMaterials);
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		
		storageService.store(file);
		UploadVideo upload = new UploadVideo();
		String id_video = "https://www.youtube.com/watch?v=";
		id_video = id_video + upload.addVideo(videoMaterials.getidmaterials(), file.getOriginalFilename());
		videoMaterials.setVideo(id_video);
		videoMaterialsRepository.save(videoMaterials);
		//System.out.println(id_video);
		//model.addAttribute("id_video", id_video);

		return "redirect:/course";
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}

}