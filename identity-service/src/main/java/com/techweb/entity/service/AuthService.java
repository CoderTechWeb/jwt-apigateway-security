package com.techweb.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.techweb.entity.UserCredential;
import com.techweb.repository.UserCredentialRespository;

@Service
public class AuthService {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserCredentialRespository respository;

	@Autowired
	private JwtService jwtService;

	public String saveUser(UserCredential credential) {
		credential.setPassword(passwordEncoder.encode(credential.getPassword()));
		respository.save(credential);
		return "User added to the system";
	}

	public String generateToken(String username) {
		return jwtService.generateToken(username);
	}

	public void validateToken(String token) {
		jwtService.validateToken(token);
	}

}
