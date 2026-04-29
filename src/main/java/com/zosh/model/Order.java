package com.zosh.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zosh.dto.RestaurantDto;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @ManyToOne
    User customer;

    @JsonIgnore
    @ManyToOne
    Restaurant restaurant;

    Long totalAmount;

    String orderStatus;

    Date createAt;

    @ManyToOne
    Address deliveryAddress;

    @OneToMany
    List<OrderItem> items;

//    @OneToOne
//    Payment payment;

    int totalItem;

    Long totalPrice;
}
