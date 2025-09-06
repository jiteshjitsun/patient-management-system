package com.example.authservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginRequestDTO {

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be a valid email req")
    private String email;


    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password should be at least 8 char long")
    private String password;

    public @NotBlank(message = "Email is required") @Email(message = "Email should be a valid email req") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be a valid email req") String email) {
        this.email = email;
    }

    public @NotBlank(message = "Password is required") @Size(min = 8, message = "Password should be atleast 8 char long") String getPassword() {
        return password;
    }

    public void setPassword(@NotBlank(message = "Password is required") @Size(min = 8, message = "Password should be atleast 8 char long") String password) {
        this.password = password;
    }
}
