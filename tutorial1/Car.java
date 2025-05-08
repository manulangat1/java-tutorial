package tutorial1;

public class Car implements Vehicle {
    private int gear = 0;
    private int speed = 0;

    @Override
    public void speedUp(int a) {
        // TODO Auto-generated method stub
        this.speed += a;

    }

    @Override
    public void changeGear(int a) {
        // TODO Auto-generated method stub
        this.gear = a;

    }

    @Override
    public void slowDown(int a) {
        // TODO Auto-generated method stub
        this.speed -= a;
    }

    public void display() {
        System.out.println("I am a car, going " + this.speed + "km/h and I am in gear" + this.gear);
        out();
    }

}
