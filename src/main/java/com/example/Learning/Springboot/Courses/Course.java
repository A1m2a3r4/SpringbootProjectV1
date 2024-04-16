package com.example.Learning.Springboot.Courses;

public class Course {
	private int Id;
	private String name;
	private String Author;
	public Course(int id, String name, String author) {
		super();
		Id = id;
		this.name = name;
		Author = author;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + ", Author=" + Author + "]";
	}
	
	

}
