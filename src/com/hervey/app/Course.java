package com.hervey.app;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	List<Course> prerequisites = new ArrayList<Course>();
	String name;
	Integer courseNumber;

	public Course() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Course(String name, Integer courseNumber) {
		super();
		this.prerequisites = prerequisites;
		this.name = name;
		this.courseNumber = courseNumber;
	}



	public void addPrereq(Course course) {
		this.prerequisites.add(course);
	}



	public List<Course> getPrerequisites() {
		return prerequisites;
	}



	public void setPrerequisites(List<Course> prerequisites) {
		this.prerequisites = prerequisites;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getCourseNumber() {
		return courseNumber;
	}



	public void setCourseNumber(Integer courseNumber) {
		this.courseNumber = courseNumber;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseNumber == null) ? 0 : courseNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((prerequisites == null) ? 0 : prerequisites.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (courseNumber == null) {
			if (other.courseNumber != null)
				return false;
		} else if (!courseNumber.equals(other.courseNumber))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (prerequisites == null) {
			if (other.prerequisites != null)
				return false;
		} else if (!prerequisites.equals(other.prerequisites))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Course name=" + name + " and prerequisites are:  " + this.prerequisites;
	}
	

	
	
	
	
	
}
