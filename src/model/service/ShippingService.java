package model.service;

import model.entities.Order;

public class ShippingService implements Shipping{

    public Double shipping(Order order) {
        double frete = 0;
        if (order.getBasic() < 100.0) {
            frete = 20.00;
        } else if (order.getBasic() < 200.0) {
            frete = 12.00;
        }
        return frete;
    }
}
