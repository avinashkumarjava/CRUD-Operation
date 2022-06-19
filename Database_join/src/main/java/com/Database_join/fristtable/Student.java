package com.Database_join.fristtable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "Student")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String  Father_name;
	private String  Age;
	private int  mo_number;
	private String  course;
	private int  course_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public int getMo_number() {
		return mo_number;
	}
	public void setMo_number(int mo_number) {
		this.mo_number = mo_number;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Father_name=" + Father_name + ", Age=" + Age + ", mo_number="
				+ mo_number + ", course=" + course + ", course_id=" + course_id + "]";
	}


}
