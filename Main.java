import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import tutorial1.OuterClass;
import tutorial1.Student;

public class Main {
    public static void main(String[] args) {
        // primitive data types
        // int myAge = 10;
        // double num2 = 10.0;
        // boolean isSignUp = false;
        // char c = '9';

        // System.out.println(myAge);

        // String name = "Kipchric";

        // // System.out.print(name, " is my name");

        // // basic operations
        // int tim = myAge + 1;
        // int x;
        // x = 300;

        // float u = x / 78;

        // // System.out.println(tim);
        // System.err.println(x);
        // System.out.println(u);

        // // inpout from user
        // // Scanner sc = new Scanner(System.in);
        // // System.out.println("What is your name?");
        // // String scanned = sc.next();
        // // System.out.println(scanned);
        // // System.out.println("What is your age?");
        // // int age = sc.nextInt();

        // // System.out.println("You have noted that your name is ");

        // // boolean compare = 10 != Integer.parseInt("10");
        // // System.out.println(compare);

        // // if (age >= 30) {
        // // System.out.println("You are of the correct age!");
        // // System.out.println("Your fave food");
        // // String food = sc.nextLine();
        // // System.out.println("Your fave food is " + food);
        // // } else if (20 <= age && age <= 30) {
        // // System.out.println("You are almost there");
        // // } else {
        // // System.out.print("You are way out of your league boy");
        // // }

        // // arrays

        // // int[] newArr = new int[5];
        // // newArr.
        // String[] newArr = new String[5];
        // // System.out.println(newArr.length);
        // Random random = new Random();

        // for (int i = 0; i < newArr.length; i++) {
        // newArr[i] = String.valueOf(random.nextInt(100));

        // // String.valueOf(i + 2);
        // }
        // System.out.println(Arrays.toString(newArr));
        // int count = 0;
        // for (String element : newArr) {
        // System.out.println(element + " " + count);
        // count++;
        // if (element.equals(6) || count == 2) {
        // System.out.println("Breaking out of the loop");
        // break;
        // }
        // // break
        // }

        // // sets
        // // Set<Integer> t = new HashSet<Integer>();
        // // Set<Integer> t = new TreeSet<Integer>();
        // Set<Integer> t = new LinkedHashSet<Integer>();
        // for (int i = 0; i < 10; i++) {
        // t.add(random.nextInt(i, 100));
        // }
        // // t.add(5)
        // System.out.println(t);

        // // array list
        // ArrayList<Integer> m = new ArrayList<Integer>();

        // // hashmap
        // // Map nm = new HashMap();
        // // m.put("tim")

        // // Objects
        // // Scanner sc = new Scanner(System.in);
        // // sc.next();
        // // int xy = 5;
        // // String ky = "hello";

        // Dog Tim = new Dog("Kio", 4);
        // System.out.println(Tim);
        // Tim.speak();
        // System.out.println(Tim.getAge());
        // Tim.setAge(100);
        // Tim.speak();
        // System.out.println("Studying inheritance in the ghetto!");
        // Cat cat = new Cat("Time", 100, 200);
        // // System.out.println(cat.);
        // cat.speak();
        // System.out.println(cat.getAge());
        // cat.setAge(1000);
        // cat.speak();
        // System.out.println(Dog1.count);
        // Dog1 tim = new Dog1("Tim", 11);
        // Dog1 bill = new Dog1("Bill", 22);
        // System.out.println(Dog1.count);
        // Dog1.display();

        Student joe = new Student("Joe");
        Student bill = new Student("Joe");
        Student harry = new Student("harry");

        System.out.println(joe.equals(bill));
        System.out.println(joe.compareTo(bill) > 0);

        System.out.println(joe);

        OuterClass oc = new OuterClass();
        oc.inner();
    }
}
