package model.application;

import model.entities.Order;
import model.service.OrderService;


import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        double basic = sc.nextDouble();
        double discount = sc.nextDouble();

        Order order = new Order(code,basic, discount);

        double valueTotal = new OrderService().total(order);

        System.out.println("Pedido código " + code);
        System.out.println("Valor total: R$ " + String.format("%.2f", valueTotal));





        sc.close();
    }
}
