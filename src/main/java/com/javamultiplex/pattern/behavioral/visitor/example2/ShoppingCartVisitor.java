package com.javamultiplex.pattern.behavioral.visitor.example2;

public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}