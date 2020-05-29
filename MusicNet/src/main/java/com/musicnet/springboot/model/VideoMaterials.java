package com.musicnet.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "videomaterials", schema = "musicnet")
public class VideoMaterials {
	
	public int idmaterials;
	public String video;
	
	public VideoMaterials() {
		
	}
	
	public VideoMaterials(int idmaterials, String video) {
		this.idmaterials = idmaterials;
		this.video = video;
	}
	
	
	@Column(name = "idmaterials", nullable = false)
	public int getidmaterials() {
		return idmaterials;
	}
	
	public void setidmaterials(int idmaterials) {
		this.idmaterials = idmaterials;
	}
	
	@Id
	@Column(name = "video", nullable = false)
	public String getVideo() {
		return video;
	}
	
	public void setVideo(String video) {
		this.video = video;
	}
	
	@Override
	public String toString() {
		return "VideoMaterials [idmaterials=" + idmaterials + ", video=" + video + "]";
	}


	
}
