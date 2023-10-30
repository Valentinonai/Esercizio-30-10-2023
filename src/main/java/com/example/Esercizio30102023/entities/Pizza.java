package com.example.Esercizio30102023.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
    private String name;
    private int calories;
    private double price;
    private List<Topping> toppingList;

    public Pizza(String name,List<Topping> toppingList){
        this.name=name;
        this.price=setPrice(toppingList);
        this.toppingList=toppingList;
        this.calories=setCalories(toppingList);
    }
    public int setCalories(List<Topping> toppingList){
       int tot=1012;
       for(int i=0;i<toppingList.size();i++){
           tot+=toppingList.get(i).getCalories();
       }
       return tot;
    }
    public double setPrice(List<Topping> t){
        double tot=4.30;
        for(int i=0;i<toppingList.size();i++){
            tot+=toppingList.get(i).getPrice();
        }
        return tot;
    }
}
