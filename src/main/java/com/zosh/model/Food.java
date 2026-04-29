package com.zosh.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;
    String description;
    Long price;

    @ManyToOne
    Category foodCategory;

    @Column(length = 1000)
    @ElementCollection
    List<String> images;

    boolean available;

    @ManyToOne
    Restaurant restaurant;

    boolean isVegetarian;
    boolean isSeasonal;

    @ManyToMany
    List<IngredientsItem> ingredients = new ArrayList<>();

    Date creationDate;

}

