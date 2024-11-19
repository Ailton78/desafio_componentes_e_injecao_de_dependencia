package model.service;

import model.entities.Order;

public interface Shipping {
   default Double shipping(Order order) {
       return 0.0;
   }
}
