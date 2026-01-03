package com.org.auth.auth_app_backend.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor

public class RoleDto {

    private UUID id ;
    private String name;
}
