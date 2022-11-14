package ss7_abctractClass_Interface.thuc_hanh.Main;

import ss7_abctractClass_Interface.thuc_hanh.Fruit.Apple;
import ss7_abctractClass_Interface.thuc_hanh.Fruit.Fruit;
import ss7_abctractClass_Interface.thuc_hanh.Fruit.Orange;

public class MainFruit {
    public static void main(String[] args) {
        Fruit[ ] fruits = new Fruit[2];
        fruits[0]= new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit:fruits){
            System.out.println(fruit.howToEat());
        }

    }
}
