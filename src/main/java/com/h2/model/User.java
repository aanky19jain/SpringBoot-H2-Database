package com.h2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Table(name = "User")
@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
}
