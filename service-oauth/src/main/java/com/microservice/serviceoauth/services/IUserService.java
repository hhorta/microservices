package com.microservice.serviceoauth.services;

import com.microservice.commonsuser.models.entity.User;


public interface IUserService {

    public User findByUserName(String username);

    public User update (Long id, User user);
}
