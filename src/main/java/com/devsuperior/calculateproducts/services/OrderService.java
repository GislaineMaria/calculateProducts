package com.devsuperior.calculateproducts.services;

import com.devsuperior.calculateproducts.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        double discountedTotal = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
        double shippingCost = shippingService.shipment(order);
        return discountedTotal + shippingCost;
    }
}
