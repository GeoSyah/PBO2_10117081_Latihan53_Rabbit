/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan53_rabbit;

/**
 *
 * @author Geo Syah Alkautsar
 */
class Rabbit extends Animal {
  
    private String color;
    private String name;
   
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.vegetarian = veg;
        this.eats = food;
        this.noOfLegs = legs;
        this.color = color;
        
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
      
}
