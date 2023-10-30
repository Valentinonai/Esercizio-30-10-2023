package com.example.Esercizio30102023.entities;

import lombok.Getter;
import lombok.ToString;

import java.util.List;
@Getter
public abstract class Item {

    protected int calories;
    protected double price;

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
    public Item(List<Topping> toppingList, boolean isXl) {
        this.calories = setCalories(toppingList,isXl);
        this.price =setPrice(toppingList,isXl);
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
