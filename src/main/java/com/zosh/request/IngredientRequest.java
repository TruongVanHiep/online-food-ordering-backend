package com.zosh.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class IngredientRequest {
    String name;
    Long categoryId;
    Long restaurantId;
}
