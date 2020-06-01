package br.maua.model;

import br.maua.enumerates.AnimalClasses;
import br.maua.interfaces.Eat;
import br.maua.interfaces.Walk;

public abstract class Animal implements Walk, Eat {
    private AnimalClasses animalClass;
    private String name;

    /**
     * 
     * @param animalClass classe do animal
     * @param name nome do animal
     */
    public Animal(AnimalClasses animalClass, String name) {
        this.animalClass = animalClass;
        this.name = name;
    }
    /**
     * 
     * @return Classe do animal
     */
    public AnimalClasses getAnimalClass() {
        return animalClass;
    }

    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }
}
