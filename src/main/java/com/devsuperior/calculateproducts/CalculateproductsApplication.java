package com.devsuperior.calculateproducts;

import com.devsuperior.calculateproducts.entities.Order;
import com.devsuperior.calculateproducts.services.OrderService;
import com.devsuperior.calculateproducts.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculateproductsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CalculateproductsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        OrderService orderService = new OrderService(new ShippingService());

        Order order1 = new Order(1034, 150.00, 20.0);
        double total1 = orderService.total(order1);
        System.out.println("Pedido código " + order1.getCode());
        System.out.println("Valor total: R$ " + total1);

        Order order2 = new Order(2282, 800.00, 10.0);
        double total2 = orderService.total(order2);
        System.out.println("\nPedido código " + order2.getCode());
        System.out.println("Valor total: R$ " + total2);

        Order order3 = new Order(1309, 95.90, 0.0);
        double total3 = orderService.total(order3);
        System.out.println("\nPedido código " + order3.getCode());
        System.out.println("Valor total: R$ " + total3);
    }
}
