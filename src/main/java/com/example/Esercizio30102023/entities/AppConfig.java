package com.example.Esercizio30102023.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
   @Bean(name = "toppings_tomato")
    public Topping toppingTomatoBean(){
       return new Topping("tomato",0,0);
   }
   @Bean(name = "toppings_cheese")
    public Topping toppingCheeseBean(){
       return new Topping("cheese",92,0.69);
   }
   @Bean(name = "toppings_ham")
    public Topping toppingHamBean(){
       return new Topping("Ham",35,0.99);
   }
   @Bean(name = "toppings_pineapple")
    public Topping toppingPineappleBean(){
       return new Topping("pineapple",24,0.79);
   }
   @Bean(name = "toppings_salami")
    public Topping toppingSalamiBean(){
       return new Topping("salami",86,0.99);
   }


   @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean(){
       List<Topping> tList = new ArrayList<>();
       tList.add(toppingTomatoBean());
       tList.add(toppingCheeseBean());
       return new Pizza("Pizza Margherita",tList);
   }
   @Bean(name = "hawaiian_pizza")
    public Pizza pizzaHawaiianBean(){
       List<Topping> tList = new ArrayList<>();
       tList.add(toppingTomatoBean());
       tList.add(toppingCheeseBean());
       tList.add(toppingHamBean());
       tList.add(toppingPineappleBean());
       return new Pizza("Hawaiian Pizza",tList);
   }
    @Bean(name = "salami_pizza")
    public Pizza pizzaSalamiBean(){
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingTomatoBean());
        tList.add(toppingCheeseBean());
        tList.add(toppingSalamiBean());
        return new Pizza("Salami Pizza",tList);
    }
}
