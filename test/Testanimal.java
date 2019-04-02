package ss5.test;

import ss5.edible.Edible;
import ss5.zoo.Animal;
import ss5.zoo.Chicken;
import ss5.zoo.Tiger;
import ss5.fruit.Fruit;
import ss5.fruit.Orange;
import ss5.fruit.Apple;

public class Testanimal {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[2];

        zoo[0] = new Tiger();
        zoo[1] = new Chicken();
        for (Animal animal : zoo) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];

        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}