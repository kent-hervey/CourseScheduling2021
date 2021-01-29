package com.hervey.app;

import java.util.ArrayList;
import java.util.List;

public class ScheduleMaker {


		
		public  static  String makeStandardSchedule(DegreePlan degreePlan) {
			
			List<Course> coursesScheduled = new ArrayList<Course>();
			
			//look at degree plan finding course with no pre req
			
			//add that course to coursesScheduled
			
			//here
			//look through courses not scheduled looking for any whose prerequisites have already been scheduled.
			//of those that have all prereqs met, pick lowest and add that to coursesSchedule 
			//go back to "here" until all courses have been scheduled which means size of coursesScheduled == degreePlan.numCourses
			
			
			
			
			
			
			
			return "Schedule is:  4, 5, 6, 4";
		}
		
		public static boolean DegreePlanCourseHasPrereq(Course course) {
			 //iterate through course's prerequisites ArrayList looking for any prereq
			
			if(course.getPrerequisites().size()>0) {
				return true;
			}
			
			
			return false;
		}
	

		public static void listPrereqThisCourse(Course course) {
			List<Course> prereqThisCourse = course.getPrerequisites();
			
			prereqThisCourse.stream().map(c ->  c.getCourseNumber()).forEach(System.out::println);
			
			
		}
		
		
		
}
