package com.zosh.service;

import com.zosh.model.Order;
import com.zosh.model.OrderItem;
import com.zosh.model.User;
import com.zosh.request.OrderRequest;
import org.aspectj.weaver.ast.Or;

import java.util.List;

public interface OrderService {

    Order createOrder(OrderRequest order, User user) throws Exception;
    Order updateOrder(Long orderId, String orderStatus) throws Exception;

    void cancelOrder(Long orderId) throws Exception;

    List<Order> getUsersOrders(Long userId) throws Exception;
    List<Order> getRestaurantOrders(Long restaurantId, String orderStatus) throws Exception;
    Order findOrderById(Long userId)throws Exception;
}