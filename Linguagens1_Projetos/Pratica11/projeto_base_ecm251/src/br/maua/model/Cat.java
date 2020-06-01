package br.maua.model;

import br.maua.enumerates.AnimalClasses;

public class Cat extends Animal  {
    public Cat(AnimalClasses animalClass, String name) {
        super(animalClass, name);
    }

    
    /** 
     * @param amount
     * @return String
     */
    @Override
    public String eat(int amount) {
        return String.format("Cat: %s eated %d kilograms!", this.getName(), amount);
    }

    
    /** 
     * @param distance
     * @return String
     */
    @Override
    public String walk(int distance) {
        return String.format("Cat: %s walked %d kilometers!", this.getName(), distance);
    }
}
