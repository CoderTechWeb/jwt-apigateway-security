package com.techweb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techweb.entity.UserCredential;

@Repository
public interface UserCredentialRespository extends JpaRepository<UserCredential, Integer>{

	Optional<UserCredential> findByName(String username);


}
