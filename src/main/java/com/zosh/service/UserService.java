package com.zosh.service;

import com.zosh.model.User;

public interface UserService {
    User findUserByEmail(String email) throws Exception;
    User findUserByJwtToken(String jwtToken) throws Exception;
}
