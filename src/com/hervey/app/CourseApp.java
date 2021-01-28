package com.hervey.app;

public class CourseApp {

	public CourseApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		DegreePlan degreePlanA = DegreePlanMaker.makePlanA();
		
		System.out.println(degreePlanA);
		
		String scheduleForA = ScheduleMaker.makeStandardSchedule(degreePlanA);
		
		System.out.println(scheduleForA);
	}

}
