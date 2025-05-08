public class Cat extends Dog {

    private int food;

    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public Cat(String name, int age) {
        super(name, age);
        this.food = 50;
    }

    public Cat(String name) {
        super(name, 0);
        this.food = 50;
    }

    // public Cat(String name, int age) {
    // super(name, age);
    // //TODO Auto-generated constructor stub
    // }

    public void eat() {
        this.food -= 1;
    }
}
