package model.service;

import model.entities.Order;

public class OrderService {

   private  ShippingService shippingService = new ShippingService();


    public double total(Order order){
               double frete = shippingService.shipping(order);
               return order.getBasic() - order.getDiscount() + frete;
    }
}
