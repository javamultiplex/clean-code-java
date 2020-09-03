package com.javamultiplex.pattern.behavioral.command.example1;

public class SellStock implements Order {
   private final Stock abcStock;

   public SellStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   public void execute() {
      abcStock.sell();
   }
}