/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan53_rabbit;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan deskripsi kelinci
 */
public class PBO2_10117081_Latihan53_Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit dragon = new Rabbit("Peter", false, "Grass", 4, "grey");
        System.out.println("Hello, his name is " + dragon.getName());
        System.out.println(dragon.getName() + " is Vegetarian? " + dragon.isVegetarian());
        System.out.println(dragon.getName() + " eats " + dragon.getEats());
        System.out.println(dragon.getName() + " has " + dragon.getNoOfLegs() + " legs");
        System.out.println(dragon.getName() + " color is " + dragon.getColor());
    }
    
}
