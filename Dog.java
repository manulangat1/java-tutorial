public class Dog {
    protected String name;
    protected int age;

    // protected keyword - only same package or sub classes of the class can have
    // access to this.

    // constructor
    public Dog(String name, int age) {
        this.age = age;
        this.name = name;

    }

    public void speak() {
        System.out.println("I am \t " + this.name + " \t and I am " + this.age + "\t years old");
    }

    public static void main(String[] args) {
        System.out.println("I am a dog");
    }

    public int getAge() {
        return this.age;
    }

    public int setAge(int age) {
        this.age = age;
        return this.age;
    }
}
