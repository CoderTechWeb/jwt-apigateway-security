package com.webtechnie.swiggyapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webtechnie.swiggyapp.client.RestaurantServiceClient;
import com.webtechnie.swiggyapp.dto.OrderResponseDTO;

@Service
public class SwiggyAppService {
	
	@Autowired
    private RestaurantServiceClient restaurantServiceClient;


	public String greeting() {
		return "Welcome to Swiggy App Service";
	}

	public OrderResponseDTO checkOrderStatus(String orderId) {
		return restaurantServiceClient.fetchOrderStatus(orderId);
	}

}
