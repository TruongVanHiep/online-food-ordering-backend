package com.zosh.response;

import com.zosh.model.USER_ROLE;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthResponse {
    String jwt;
    String message;
    USER_ROLE role;
}
