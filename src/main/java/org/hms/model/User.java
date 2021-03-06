package org.hms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;


@Entity
@Table(name="user")
public class User {
	
	@Id
	@TableGenerator(name="id_user_gen",pkColumnName="gen_name",valueColumnName="gen_value",pkColumnValue="user_id",table="id_gen")
	@GeneratedValue(generator="id_user_gen")
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String country;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
