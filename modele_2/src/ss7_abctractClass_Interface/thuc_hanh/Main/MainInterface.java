package ss7_abctractClass_Interface.thuc_hanh.Main;

import ss7_abctractClass_Interface.Chicken;
import ss7_abctractClass_Interface.thuc_hanh.Animal.Animal;
import ss7_abctractClass_Interface.thuc_hanh.Animal.Tiger;
import ss7_abctractClass_Interface.thuc_hanh.InterfaceEdible;

public class MainInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new Chicken();
        for (Animal animal:animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                InterfaceEdible interfaceEdible = (Chicken)animal;
                System.out.println(interfaceEdible.howToEat());
            }
        }

    }
}
