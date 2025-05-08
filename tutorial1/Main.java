package tutorial1;

public class Main {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.speedUp(110);
        ford.display();
        ford.changeGear(2);
        ford.slowDown(10);
        ford.display();

        int x = Vehicle.math(8);
        System.out.println(x);
    }
}
