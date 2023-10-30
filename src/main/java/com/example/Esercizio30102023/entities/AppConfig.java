package com.example.Esercizio30102023.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
       return new Topping("Ham",0,0);
   }
   @Bean(name = "toppings")
    public Topping toppingBean(){
       return new Topping("tomato",0,0);
   }
   @Bean(name = "toppings")
    public Topping toppingBean(){
       return new Topping("tomato",0,0);
   }
}
