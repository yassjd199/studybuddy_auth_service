package com.studybuddy.auth_service.DTO;

public class LoginResponse {
    private String token;
    private Integer userId;

    public LoginResponse(String token, Integer userId) {
        this.token = token;
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public Integer getUserId() {
        return userId;
    }
}
