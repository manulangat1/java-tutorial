package tutorial1;

// only public methods and do not define anything here
public interface Vehicle {

    final int gears = 5;

    void changeGear(int a);

    void speedUp(int a);

    void slowDown(int a);

    default void out() {
        System.out.println("Default Method");
    }

    static int math(int b) {
        return b + 9;
    }

}