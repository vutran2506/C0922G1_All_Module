package ss7_abctractClass_Interface;

import ss7_abctractClass_Interface.thuc_hanh.Animal.Animal;
import ss7_abctractClass_Interface.thuc_hanh.InterfaceEdible;

public class Chicken extends Animal implements InterfaceEdible {
    @Override
    public String makeSound() {
        return "Chicken:cuctac cuctac";
    }

    @Override
    public String howToEat() {
        return "could be tried";
    }
}
