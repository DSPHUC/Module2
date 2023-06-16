package AbstractClass_And_Interface.AnimalClass_And_InterfaceEdible.Animal;

import AbstractClass_And_Interface.AnimalClass_And_InterfaceEdible.Edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck- cluck";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
