package com.javamultiplex.pattern.behavioral.visitor.example1;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}