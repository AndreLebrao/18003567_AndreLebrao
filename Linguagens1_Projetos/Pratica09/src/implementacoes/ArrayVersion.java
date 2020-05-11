package implementacoes;

import models.Dog;

public class ArrayVersion {
    
    
    public static void run(){
        // System.out.println("run");
        Dog [] dogs = new Dog[3];
        Dog dog = new Dog("Pepper", "Schnauzer", 12);
        dogs[0] = dog;
        dogs[1] = new Dog("Pelinho", "Liaza", 5);
        dogs[2] = new Dog("Pagu", "Boxer", 20);
        for (int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i]);
        }
    }
}