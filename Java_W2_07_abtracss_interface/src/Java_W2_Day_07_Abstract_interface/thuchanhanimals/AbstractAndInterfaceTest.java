package Java_W2_Day_07_Abstract_interface.thuchanhanimals.animals;

import Java_W2_Day_07_Abstract_interface.thuchanhanimals.animals.edible.Edible;
import Java_W2_Day_07_Abstract_interface.thuchanhanimals.fruit.Apple;
import Java_W2_Day_07_Abstract_interface.thuchanhanimals.fruit.Fruit;
import Java_W2_Day_07_Abstract_interface.thuchanhanimals.fruit.Orange;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
      Animal[]animals=new Animal[2];
      animals[0]=new Tiger();
      animals[1]=new Chicken();
      for (Animal animal:animals){
          System.out.println(animal.makeSound());
          if (animal instanceof Chicken){
              Edible edibler =(Chicken) animal;
              System.out.println(edibler.howToEat());
          }
      }
        System.out.println("======================");
        Fruit[] fruits=new Fruit[2];
      fruits[0]=new Orange();
      fruits[1]=new Apple();
      for (Fruit fruit: fruits){
          System.out.println(fruit.howToEat());
      }
    }
}
