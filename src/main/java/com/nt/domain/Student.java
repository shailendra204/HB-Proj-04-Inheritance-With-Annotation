package com.nt.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "inn_Student_tab")
@PrimaryKeyJoinColumn(name = "person_Id",referencedColumnName = "personId")
public class Student extends Person {
	@Column(length = 20)
	private String address;
	@Column(length = 20)
	private String course;
	@Column(length = 20)
	private Double fee;

}
