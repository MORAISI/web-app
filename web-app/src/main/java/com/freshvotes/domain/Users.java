package com.freshvotes.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import com.freshvotes.security.Authority;

@Entity
@Table(name = "Users")

public class Users {
	private int  id;
	private String username;
	private String password;
	private String name;
	private Set<Authority> authorities = new HashSet<>();

	
	@Id @GeneratedValue(strategy= GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "users")
	public Set<Authority> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}

	
}
