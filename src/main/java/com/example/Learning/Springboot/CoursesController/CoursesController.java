package com.example.Learning.Springboot.CoursesController;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Learning.Springboot.Courses.Course;

@RestController
public class CoursesController {
	
	@GetMapping("/Courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn Nothing", "Udemy"),
				new Course(2, "Learn AI", "Udemy")
				);
	}

}
