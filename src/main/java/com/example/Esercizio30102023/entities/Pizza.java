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
    private boolean isXl=false;

    public Pizza(String name,List<Topping> toppingList,boolean isXl){
        this.name=name;
        this.price=setPrice(toppingList,isXl);
        this.toppingList=toppingList;
        this.calories=setCalories(toppingList,isXl);
        this.isXl=isXl;
    }
    public int setCalories(List<Topping> toppingList,boolean isXl){
       int tot=1012;
       if(toppingList!=null){
           for(int i=0;i<toppingList.size();i++){
               tot+=toppingList.get(i).getCalories();
           }
       }
if(isXl) return tot+=(tot*5)/100;
else return tot;
    }
    public double setPrice(List<Topping> t,boolean isXl){
        double tot=4.30;
        if(t!=null){
            for(int i=0;i<t.size();i++){
                tot+=t.get(i).getPrice();
            }
        }

        if(isXl) return tot+=(tot*10)/100;
        else return tot;
    }
}
