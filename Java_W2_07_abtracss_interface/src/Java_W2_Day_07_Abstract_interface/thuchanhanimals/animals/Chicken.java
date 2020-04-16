package Java_W2_Day_07_Abstract_interface.thuchanhanimals.animals;

import Java_W2_Day_07_Abstract_interface.thuchanhanimals.animals.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chiken : cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried OK";
    }
}
