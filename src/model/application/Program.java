package model.application;

import model.entities.Order;
import model.service.OrderService;
import model.service.ShippingService;


import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Code: ");
        int code = sc.nextInt();
        System.out.print("Basic value: ");
        double basic = sc.nextDouble();
        System.out.print("Discount value: ");
        double discount = sc.nextDouble();

        Order order = new Order(code,basic, discount);

        OrderService orderService = new OrderService(new ShippingService());
        double valueTotal = orderService.total(order);

        System.out.println("Pedido código " + code);
        System.out.println("Valor total: R$ " + String.format("%.2f", valueTotal));





        sc.close();
    }
}
