package ss5_Access_Modifier_Static.thuc_hanh.StaticProperty;

public class StaticProperty {
    private String Car;
    private String engine;
    public static int numberOfCar;

    StaticProperty(String Car, String engine) {
        this.Car = Car;
        this.engine = engine;
        numberOfCar++;
    }
void display(){
    System.out.println(this.Car+" "+this.engine);
}
}

 class TestStaticProperty {
    public static void main(String[] args) {
        StaticProperty staticProperty = new StaticProperty("Ferari", "V12");
        System.out.println(StaticProperty.numberOfCar);
        staticProperty.display();
        StaticProperty staticProperty1 = new StaticProperty("Lamboghini", "V12");
        System.out.println(StaticProperty.numberOfCar);
        staticProperty1.display();
    }
}


