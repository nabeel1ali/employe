package com.learning.employe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Please enter firstname.")
	@Column(name = "first_name")
	private String firstName;

	@NotEmpty(message = "Please enter lastname.")
	@Column(name = "last_name")
	private String lastName;

	@NotEmpty
	@Email
	@Size(max = 255, message = "Email length must be less than or equal to 255")
	@Column(name = "email")
	private String email;

	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	private Department department;
}
