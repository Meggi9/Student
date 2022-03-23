package com.example.application.Enity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    Student;

    @Override
    public String getAuthority() {
        return name();
    }
}
