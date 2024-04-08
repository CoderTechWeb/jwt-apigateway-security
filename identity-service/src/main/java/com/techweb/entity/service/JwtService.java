package com.techweb.entity.service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {

	public static final String SECRET = "8Zz5tw0Ionm3XPZZfN0NOml3z9FMfmpgXwovR9fp6ryDIoGRM8EPHAB6iHsc0fb";
	
	public void validateToken(final String token) {
		Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
	}
	
	public String generateToken(String userName) {
		HashMap<String, Object> claims = new HashMap<>();
		return createToken(claims, userName);
	}

	private String createToken(HashMap<String, Object> claims, String userName) {
		return Jwts.builder()
					.setClaims(claims)
					.setSubject(userName)
					.setIssuedAt(new Date(System.currentTimeMillis()))
					.setExpiration(new Date(System.currentTimeMillis()+1000 * 60 * 30))
					.signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
	}
	
	private Key getSignKey() {
		byte[] keyBytes = Decoders.BASE64.decode(SECRET);
		return Keys.hmacShaKeyFor(keyBytes);
	}
}
