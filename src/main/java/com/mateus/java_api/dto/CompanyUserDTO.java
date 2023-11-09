package com.mateus.java_api.dto;

import java.util.List;

import com.mateus.java_api.model.CompanyModel;
import com.mateus.java_api.model.UserModel;

import lombok.Data;

@Data
public class CompanyUserDTO {
    private UserModel User;
    private List<UserModel> userList;
    private CompanyModel company;
}
