public class Dog1 {

    // Static allows us to change in all instances

    protected static int count = 0;

    protected String name;
    protected int age;

    public Dog1(String name, int age) {
        this.age = age;
        this.name = name;
        Dog1.count += 1;
        Dog1.display();
        // this.display2();
    }

    public static void display() {
        System.out.println("Adding a new dog");
    }

    public void display2() {
        System.out.println("I am a dog");
    }
}
