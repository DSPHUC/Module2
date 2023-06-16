package AbstractClass_And_Interface.AnimalClass_And_InterfaceEdible.Animal;

//import AbstractClass_And_Interface.AnimalClass_And_InterfaceEdible.Animal.Chicken;
import AbstractClass_And_Interface.AnimalClass_And_InterfaceEdible.Edible.Edible;
import AbstractClass_And_Interface.AnimalClass_And_InterfaceEdible.Fruit.Apple;
import AbstractClass_And_Interface.AnimalClass_And_InterfaceEdible.Fruit.Fruit;
import AbstractClass_And_Interface.AnimalClass_And_InterfaceEdible.Fruit.Orange;

public class Abstrack_And_Interface_Test {
    public static void main(String[] args) {
        Animal[] animal = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for (Animal animal1 : animal) {
            System.out.println(animal1.makeSound());
            if (animal1 instanceof Chicken) {
                Edible chicken = (Chicken) animal1;
                System.out.println(chicken.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
