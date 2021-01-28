package com.hervey.app;

public class DegreePlanMaker {

	public DegreePlanMaker() {
		// TODO Auto-generated constructor stub
	}

	public static DegreePlan makePlanA() {
		DegreePlan planA = new DegreePlan();
		planA.setNumCourses(4);
		
		Course courseZero = new Course();
		courseZero.name="zero";
		courseZero.courseNumber=0;
		Course courseOne = new Course();
		courseOne.setName("one");
		courseOne.setCourseNumber(1);
		Course courseTwo = new Course();
		courseTwo.setName("two");
		courseTwo.setCourseNumber(2);
		Course courseThree = new Course();
		courseThree.setName("three");
		courseThree.setCourseNumber(3);
		
		//courseZero.prerequisites.add(null);
		courseOne.prerequisites.add(courseZero);
		courseTwo.prerequisites.add(courseZero);
		
		courseThree.prerequisites.add(courseOne);
		courseThree.prerequisites.add(courseTwo);
		
		planA.coursesInDegreePlan.add(courseZero);
		planA.coursesInDegreePlan.add(courseOne);
		planA.coursesInDegreePlan.add(courseTwo);
		planA.coursesInDegreePlan.add(courseThree);
		
		return planA;
		
	}
	
	
	
	
	
}
