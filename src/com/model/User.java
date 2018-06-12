package com.model;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity( name="USER")
public class User implements Serializable {

	@GeneratedValue(strategy=GenerationType.AUTO)
	 @Id
	private Integer userId;
	private String name;
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	} 
	
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
