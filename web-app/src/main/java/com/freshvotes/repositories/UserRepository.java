package com.freshvotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freshvotes.domain.Users;


//jpa is a repository to do the CRUD process for us
// to be used in the services

public interface UserRepository extends JpaRepository<Users, Integer>{

	Users findByUsername(String username);
	

}
