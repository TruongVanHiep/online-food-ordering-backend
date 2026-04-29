package com.zosh.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ContactInformation {
    String email;
    String mobile;
    String twitter;
    String instagram;
}
