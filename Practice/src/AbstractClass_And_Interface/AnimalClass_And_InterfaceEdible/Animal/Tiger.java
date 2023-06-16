package AbstractClass_And_Interface.AnimalClass_And_InterfaceEdible.Animal;

import AbstractClass_And_Interface.AnimalClass_And_InterfaceEdible.Animal.Animal;

public class Tiger extends Animal {
    @Override
    public  String makeSound(){
        return "Tiger: roarrrrrrr";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
