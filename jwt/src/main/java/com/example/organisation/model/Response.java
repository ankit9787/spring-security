package com.example.organisation.model;

public class Response {

	private final String jwtToken;

	public Response(String jwtToken) {
		this.jwtToken = jwtToken;
	}

	public String getJwtToken() {
		return jwtToken;
	}
}
