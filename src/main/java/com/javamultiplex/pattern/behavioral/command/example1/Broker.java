package com.javamultiplex.pattern.behavioral.command.example1;

import java.util.ArrayList;
import java.util.List;

public class Broker {
   private final List<Order> orderList = new ArrayList<>();

   public void takeOrder(Order order){
      orderList.add(order);		
   }

   public void placeOrders(){
   
      for (Order order : orderList) {
         order.execute();
      }
      orderList.clear();
   }
}
