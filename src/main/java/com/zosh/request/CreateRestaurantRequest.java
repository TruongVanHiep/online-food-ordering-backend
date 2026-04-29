package com.zosh.request;

import com.zosh.model.Address;
import com.zosh.model.ContactInformation;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class CreateRestaurantRequest {
    Long id;
    String name;
    String description;
    String cuisineType;
    Address address;
    ContactInformation contactInformation;
    String openingHours;
    List<String> images;

}
