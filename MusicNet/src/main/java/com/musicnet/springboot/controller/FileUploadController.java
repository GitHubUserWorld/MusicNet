package com.musicnet.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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
	public FileUploadController() { 
	}


	@PostMapping("/files")
	public String handleFileUpload(@RequestParam("file") MultipartFile file, VideoMaterials videoMaterials, Model model) {
		storageService.store(file);
		UploadVideo upload = new UploadVideo();
		String id_video = "https://www.youtube.com/watch?v=";
		id_video = id_video + upload.addVideo(videoMaterials.getidmaterials(), file.getOriginalFilename());
		videoMaterials.setVideo(id_video);
		videoMaterialsRepository.save(videoMaterials);
		return "redirect:/course";
	}

	//@ExceptionHandler(StorageFileNotFoundException.class)
	//public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
	//	return ResponseEntity.notFound().build();
	//}

}