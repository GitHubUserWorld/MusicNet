package com.musicnet.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tools", schema = "musicnet")
public class Tools {
	
	private int courseid;
	private int metronom1;
	private int metronom2;
	private int metronom3;
	private int metronom4;
	private int metronom5;
	private int metronom6;
	private int metronom7;
	private String backingtrackname1;
	private int backingtrackvelocity1;
	private String backingtrackname2;
	private int backingtrackvelocity2;
	private String backingtrackname3;
	private int backingtrackvelocity3;
	private String compastrackname1;
	private int compastrackvelocity1;
	private String compastrackname2;
	private int compastrackvelocity2;
	private String compastrackname3;
	private int compastrackvelocity3;
	
	public Tools() {
		
	}

	public Tools(int courseid, int metronom1, int metronom2, int metronom3, int metronom4, int metronom5, int metronom6,
			int metronom7, String backingtrackname1, int backingtrackvelocity1, String backingtrackname2,
			int backingtrackvelocity2, String backingtrackname3, int backingtrackvelocity3, String compastrackname1,
			int compastrackvelocity1, String compastrackname2, int compastrackvelocity2, String compastrackname3,
			int compastrackvelocity3) {
		this.courseid = courseid;
		this.metronom1 = metronom1;
		this.metronom2 = metronom2;
		this.metronom3 = metronom3;
		this.metronom4 = metronom4;
		this.metronom5 = metronom5;
		this.metronom6 = metronom6;
		this.metronom7 = metronom7;
		this.backingtrackname1 = backingtrackname1;
		this.backingtrackvelocity1 = backingtrackvelocity1;
		this.backingtrackname2 = backingtrackname2;
		this.backingtrackvelocity2 = backingtrackvelocity2;
		this.backingtrackname3 = backingtrackname3;
		this.backingtrackvelocity3 = backingtrackvelocity3;
		this.compastrackname1 = compastrackname1;
		this.compastrackvelocity1 = compastrackvelocity1;
		this.compastrackname2 = compastrackname2;
		this.compastrackvelocity2 = compastrackvelocity2;
		this.compastrackname3 = compastrackname3;
		this.compastrackvelocity3 = compastrackvelocity3;
	}

	@Id
	@Column(name = "courseid", nullable = false)
	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	@Column(name = "metronom1", nullable = false)
	public int getMetronom1() {
		return metronom1;
	}

	public void setMetronom1(int metronom1) {
		this.metronom1 = metronom1;
	}

	@Column(name = "metronom2", nullable = true)
	public int getMetronom2() {
		return metronom2;
	}

	public void setMetronom2(int metronom2) {
		this.metronom2 = metronom2;
	}

	@Column(name = "metronom3", nullable = true)
	public int getMetronom3() {
		return metronom3;
	}

	public void setMetronom3(int metronom3) {
		this.metronom3 = metronom3;
	}

	@Column(name = "metronom4", nullable = true)
	public int getMetronom4() {
		return metronom4;
	}

	public void setMetronom4(int metronom4) {
		this.metronom4 = metronom4;
	}

	@Column(name = "metronom5", nullable = true)
	public int getMetronom5() {
		return metronom5;
	}

	public void setMetronom5(int metronom5) {
		this.metronom5 = metronom5;
	}

	@Column(name = "metronom6", nullable = true)
	public int getMetronom6() {
		return metronom6;
	}

	public void setMetronom6(int metronom6) {
		this.metronom6 = metronom6;
	}

	@Column(name = "metronom7", nullable = true)
	public int getMetronom7() {
		return metronom7;
	}

	public void setMetronom7(int metronom7) {
		this.metronom7 = metronom7;
	}

	@Column(name = "backingtrackname1", nullable = false)
	public String getBackingtrackname1() {
		return backingtrackname1;
	}

	public void setBackingtrackname1(String backingtrackname1) {
		this.backingtrackname1 = backingtrackname1;
	}

	@Column(name = "backingtrackvelocity1", nullable = false)
	public int getBackingtrackvelocity1() {
		return backingtrackvelocity1;
	}

	public void setBackingtrackvelocity1(int backingtrackvelocity1) {
		this.backingtrackvelocity1 = backingtrackvelocity1;
	}

	@Column(name = "backingtrackname2", nullable = true)
	public String getBackingtrackname2() {
		return backingtrackname2;
	}

	public void setBackingtrackname2(String backingtrackname2) {
		this.backingtrackname2 = backingtrackname2;
	}

	@Column(name = "backingtrackvelocity2", nullable = true)
	public int getBackingtrackvelocity2() {
		return backingtrackvelocity2;
	}

	public void setBackingtrackvelocity2(int backingtrackvelocity2) {
		this.backingtrackvelocity2 = backingtrackvelocity2;
	}

	@Column(name = "backingtrackname3", nullable = true)
	public String getBackingtrackname3() {
		return backingtrackname3;
	}

	public void setBackingtrackname3(String backingtrackname3) {
		this.backingtrackname3 = backingtrackname3;
	}

	@Column(name = "backingtrackvelocity3", nullable = true)
	public int getBackingtrackvelocity3() {
		return backingtrackvelocity3;
	}

	public void setBackingtrackvelocity3(int backingtrackvelocity3) {
		this.backingtrackvelocity3 = backingtrackvelocity3;
	}

	@Column(name = "compastrackname1", nullable = false)
	public String getCompastrackname1() {
		return compastrackname1;
	}

	public void setCompastrackname1(String compastrackname1) {
		this.compastrackname1 = compastrackname1;
	}

	@Column(name = "compastrackvelocity1", nullable = true)
	public int getCompastrackvelocity1() {
		return compastrackvelocity1;
	}

	public void setCompastrackvelocity1(int compastrackvelocity1) {
		this.compastrackvelocity1 = compastrackvelocity1;
	}

	@Column(name = "compastrackname2", nullable = true)
	public String getCompastrackname2() {
		return compastrackname2;
	}

	public void setCompastrackname2(String compastrackname2) {
		this.compastrackname2 = compastrackname2;
	}

	@Column(name = "compastrackvelocity2", nullable = true)
	public int getCompastrackvelocity2() {
		return compastrackvelocity2;
	}

	public void setCompastrackvelocity2(int compastrackvelocity2) {
		this.compastrackvelocity2 = compastrackvelocity2;
	}

	@Column(name = "compastrackname3", nullable = true)
	public String getCompastrackname3() {
		return compastrackname3;
	}

	public void setCompastrackname3(String compastrackname3) {
		this.compastrackname3 = compastrackname3;
	}

	@Column(name = "compastrackvelocity3", nullable = true)
	public int getCompastrackvelocity3() {
		return compastrackvelocity3;
	}

	public void setCompastrackvelocity3(int compastrackvelocity3) {
		this.compastrackvelocity3 = compastrackvelocity3;
	}

	@Override
	public String toString() {
		return "Tools [courseid=" + courseid + ", metronom1=" + metronom1 + ", metronom2=" + metronom2 + ", metronom3="
				+ metronom3 + ", metronom4=" + metronom4 + ", metronom5=" + metronom5 + ", metronom6=" + metronom6
				+ ", metronom7=" + metronom7 + ", backingtrackname1=" + backingtrackname1 + ", backingtrackvelocity1="
				+ backingtrackvelocity1 + ", backingtrackname2=" + backingtrackname2 + ", backingtrackvelocity2="
				+ backingtrackvelocity2 + ", backingtrackname3=" + backingtrackname3 + ", backingtrackvelocity3="
				+ backingtrackvelocity3 + ", compastrackname1=" + compastrackname1 + ", compastrackvelocity1="
				+ compastrackvelocity1 + ", compastrackname2=" + compastrackname2 + ", compastrackvelocity2="
				+ compastrackvelocity2 + ", compastrackname3=" + compastrackname3 + ", compastrackvelocity3="
				+ compastrackvelocity3 + "]";
	}
	

	
}
