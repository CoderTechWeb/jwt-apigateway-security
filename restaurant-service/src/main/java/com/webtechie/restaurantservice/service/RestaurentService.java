package com.webtechie.restaurantservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtechie.restaurantservice.dao.RestaurantOrderDAO;
import com.webtechie.restaurantservice.dto.OrderResponseDTO;

@Service
public class RestaurentService {

	@Autowired
    private RestaurantOrderDAO orderDAO;

    public String greeting() {
        return "Welcome to Swiggy Restaurant service";
    }

    public OrderResponseDTO getOrder(String orderId) {
        return orderDAO.getOrders(orderId);
    }

}
