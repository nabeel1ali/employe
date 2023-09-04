package com.learning.employe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
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
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message = "Firstname must not be empty.")
	@Column(name = "first_name")
	private String firstName;

	@NotEmpty(message = "Lastname must not be empty.")
	@Column(name = "last_name")
	private String lastName;

	@NotNull(message = "Username must not be empty.")
	@Size(min = 3, max = 50, message = "Your username must between 4 and 8 characters")
	@Column(name = "user_name")
	private String userName;

	@NotBlank(message = "Email cannot be blank")
	@Email
	@Size(max = 255, message = "Email length must be less than or equal to 255")
	@Column(name = "email")
	private String email;

	@NotNull
	@Size(min = 4, max = 8, message = "Your password must between 4 and 8 characters")
	@Column(name = "password")
	private String password;
}
