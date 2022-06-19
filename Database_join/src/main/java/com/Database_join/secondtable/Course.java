package com.Database_join.secondtable;

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
@Table(name = "Course")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Course_name;
	private String duration;
	private int Fees;
	private int course_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse_name() {
		return Course_name;
	}

	public void setCourse_name(String course_name) {
		Course_name = course_name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getFees() {
		return Fees;
	}

	public void setFees(int fees) {
		Fees = fees;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", Course_name=" + Course_name + ", duration=" + duration + ", Fees=" + Fees
				+ ", course_id=" + course_id + "]";
	}

}
