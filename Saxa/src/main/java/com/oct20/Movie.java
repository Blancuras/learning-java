package com.oct20;


public class Movie {

	private String title;
	private String gender;
	private int duration;

	public Movie(String title, String gender) {
		this.title = title;
		this.gender = gender;
	}

	public Movie(String title, String gender, int duration) {
		this.title = title;
		this.gender = gender;
		if (duration >0) {
			this.duration = duration;			
		}
	}

	public Movie() {
		this.title = "No title";
		this.gender = "No gender";
		this.duration = 0;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		if (duration >0) {
			this.duration = duration;			
		}
		
	}

	public void play() {
		System.out.println("Playing movie: " + title + " gender "+ gender +" duration "+ duration);
	}

	public void pause() {
		System.out.println("Pausing movie: " + title);
	}
	
	public int getTotalFrames() {
		return this.duration * 60 * 60; 
	
	}
}
