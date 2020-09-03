package com.javamultiplex.pattern.behavioral.command.example1;

public class BuyStock implements Order {
   private final Stock abcStock;

   public BuyStock(Stock abcStock){
      this.abcStock = abcStock;
   }

   public void execute() {
      abcStock.buy();
   }
}