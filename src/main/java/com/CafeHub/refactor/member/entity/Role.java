package com.CafeHub.refactor.member.entity;

import lombok.Getter;

@Getter
public enum Role {
    USER("ROLE_USER"), ADMIN("ROLE_ADMIN");


    private final String value;

    Role(String value){
        this.value = value;
    }
}