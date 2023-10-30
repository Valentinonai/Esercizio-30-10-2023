package com.example.Esercizio30102023.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

@Getter
public class Pizza extends Item {
    private String name;

    private List<Topping> toppingList;
    private boolean isXl=false;

    public Pizza(String name,List<Topping> toppingList,boolean isXl){
        super(toppingList,isXl);
        this.name=name;
        this.toppingList=toppingList;
        this.isXl=isXl;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", toppingList=" + toppingList +
                ", isXl=" + isXl +
                '}';
    }
}
