package com.hervey.app;

import java.util.ArrayList;
import java.util.List;

//utility class for building various courses

public class DegreePlan {
	
	int numCourses;
	List<Course> coursesInDegreePlan = new ArrayList<Course>();

	public DegreePlan() {
		// TODO Auto-generated constructor stub
	}

	public int getNumCourses() {
		return numCourses;
	}

	public void setNumCourses(int numCourses) {
		this.numCourses = numCourses;
	}



	public List<Course> getCoursesInDegreePlan() {
		return coursesInDegreePlan;
	}

	public void setCoursesInDegreePlan(List<Course> coursesInDegreePlan) {
		this.coursesInDegreePlan = coursesInDegreePlan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((coursesInDegreePlan == null) ? 0 : coursesInDegreePlan.hashCode());
		result = prime * result + numCourses;
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
		DegreePlan other = (DegreePlan) obj;
		if (coursesInDegreePlan == null) {
			if (other.coursesInDegreePlan != null)
				return false;
		} else if (!coursesInDegreePlan.equals(other.coursesInDegreePlan))
			return false;
		if (numCourses != other.numCourses)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DegreePlan [numCourses=" + numCourses + ", coursesInDegreePlan=" + coursesInDegreePlan + "]";
	}


	
	
	
		
		
	
	

}
