package implementacoes;

import java.util.ArrayList;

import models.Dog;

public class ArrayListVersion {
private static void run() {
    ArrayList<Dog> dogs = new ArrayList<>();
    Dog dog = new Dog("Pepper", "Schnauzer", 12);
    dogs.add(dog);
    dogs.add(new Dog("Pelinho", "Liaza", 5));
    dogs.add(new Dog("Pagu", "Boxer", 20));
    //substituto do for each
    for (Dog cachorro : dogs) {
        System.out.println(cachorro);
    }
    dogs.forEach((lambdaDog) -> System.out.println(lambdaDog));

}


}