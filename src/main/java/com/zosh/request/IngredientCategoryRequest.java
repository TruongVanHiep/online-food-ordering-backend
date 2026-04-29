package com.zosh.request;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class IngredientCategoryRequest {
        String name;
        Long restaurantId;
}
