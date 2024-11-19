package model.service;

import model.entities.Order;

public class OrderService {

   private  ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order){
               double frete = shippingService.shipping(order);
               return order.getBasic() - order.getDiscount() + frete;
    }
}
