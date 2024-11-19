package model.service;

import model.entities.Order;

public class OrderService {

   private  Shipping shipping;

    public OrderService(ShippingService shippingService) {
        this.shipping = shippingService;
    }

    public double total(Order order){
               double frete = shipping.shipping(order);
               return order.getBasic() - order.getDiscount() + frete;
    }
}
