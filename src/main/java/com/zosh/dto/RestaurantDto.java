package com.zosh.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Embeddable
@Builder
public class RestaurantDto {

    String title;

    @Column(length = 1000)
    List<String> images;

    String description;
    Long id;
}
