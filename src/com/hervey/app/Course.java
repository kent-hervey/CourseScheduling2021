package com.hervey.app;

import java.util.List;

public class Course {
	
	List<Course> prerequisites;
	String name;
	Integer courseNumber;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public void addPrereq(Course course) {
		this.prerequisites.add(course);
	}
	
	
}
