package com.hervey.app;

public class DegreePlanMaker {

	public DegreePlanMaker() {
		// TODO Auto-generated constructor stub
	}

	public static void makePlanA() {
		DegreePlan planA = new DegreePlan();
		planA.setNumCourses(4);
		
		Course courseZero = new Course();
		Course courseOne = new Course();
		Course courseTwo = new Course();
		Course courseThree = new Course();
		
		courseZero.prerequisites.add(null);
		courseOne.prerequisites.add(courseZero);
		courseTwo.prerequisites.add(courseZero);
		
		courseThree.prerequisites.add(courseOne);
		courseThree.prerequisites.add(courseTwo);
		
		planA.coursesInDegreePlan.add(courseZero);
		planA.coursesInDegreePlan.add(courseOne);
		planA.coursesInDegreePlan.add(courseTwo);
		planA.coursesInDegreePlan.add(courseThree);
		
	}
	
	
	
	
	
}
