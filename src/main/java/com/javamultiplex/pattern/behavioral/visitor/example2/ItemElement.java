package com.javamultiplex.pattern.behavioral.visitor.example2;

public interface ItemElement {

    int accept(ShoppingCartVisitor visitor);
}