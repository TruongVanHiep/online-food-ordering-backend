package com.zosh.request;

import com.zosh.model.Category;
import com.zosh.model.IngredientsItem;
import com.zosh.model.Restaurant;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateFoodRequest {
    String name;
    String description;
    Long price;

    Category category;
    List<String> images;

    Long restaurantId;
    boolean isVegetarian;
    boolean isSeasonal;
    List<IngredientsItem> ingredients;
}
