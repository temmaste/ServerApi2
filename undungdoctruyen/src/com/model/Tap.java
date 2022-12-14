package com.model;
// Generated Nov 29, 2022 12:51:20 AM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Tap generated by hbm2java
 */
public class Tap implements java.io.Serializable {

	private Integer matap;
	private Truyen truyen;
	private String tentap;
	private Set<Chuong> chuongs = new HashSet<Chuong>(0);

	public Tap() {
	}

	public Tap(Truyen truyen, String tentap) {
		this.truyen = truyen;
		this.tentap = tentap;
	}

	public Tap(Truyen truyen, String tentap, Set<Chuong> chuongs) {
		this.truyen = truyen;
		this.tentap = tentap;
		this.chuongs = chuongs;
	}

	public Integer getMatap() {
		return this.matap;
	}

	public void setMatap(Integer matap) {
		this.matap = matap;
	}

	public Truyen getTruyen() {
		return this.truyen;
	}

	public void setTruyen(Truyen truyen) {
		this.truyen = truyen;
	}

	public String getTentap() {
		return this.tentap;
	}

	public void setTentap(String tentap) {
		this.tentap = tentap;
	}

	public Set<Chuong> getChuongs() {
		return this.chuongs;
	}

	public void setChuongs(Set<Chuong> chuongs) {
		this.chuongs = chuongs;
	}

}
