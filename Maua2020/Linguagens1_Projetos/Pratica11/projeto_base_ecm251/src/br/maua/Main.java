package br.maua;

import java.util.ArrayList;

import br.maua.enumerates.AnimalClasses;
import br.maua.interfaces.Eat;
import br.maua.interfaces.Walk;
import br.maua.model.Animal;
import br.maua.model.Cat;
import br.maua.model.Dog;

/**
 * faz varias coisa ai
 */
public class Main {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(new Dog(AnimalClasses.DOMESTIC, "Thor"));
        myAnimals.add(new Cat(AnimalClasses.CIRCUS, "Gigi"));
        myAnimals.forEach(animal -> {
            howToWalk(animal, 100);
            howToEat(animal, 10);
        });
    }

    
    /** 
     * @param walker
     * @param distance
     */
    public static void howToWalk(Walk walker, int distance){
        System.out.println(walker.walk(distance));
    }

    
    /** 
     * @param eater
     * @param amount
     */
    public static void howToEat(Eat eater, int amount){
        System.out.println(eater.eat(amount));
    }
}
