package com.hervey.app;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		public static void showDegreePlanStandarListing(DegreePlan degreePlan) {
			//will print out a line for each course with its number followed by numbers of each pre-req
			//sorted by course number
			//so let's start by just printing each course in degree plan sorted by course number
			List<Course> theCourses = degreePlan.getCoursesInDegreePlan();
			for(Course course:theCourses) {
				System.out.println("Course in this Degree Plan:  " + course.getCourseNumber());
				
				if(course.getPrerequisites().size()==0) {
					System.out.println("The course number " + course.getCourseNumber() + " has no pre-reqs" + "" + "\n");
				}
				else {
									for(Course coursePrereqs : course.getPrerequisites()) {
					System.out.println("The course number " + course.getCourseNumber() + " has this pre-req:  " + coursePrereqs.getCourseNumber() + "\n");
				}
				}

				
			}
			
			
			
			
		}
		
		
}
