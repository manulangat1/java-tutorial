package tutorial1;

public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // public static void main(String[] args) {
    // System.out.println("Hi");
    // }

    public boolean equals(Student other) {
        if (this.name == other.name) {
            return true;
        }
        return false;
    }

    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        return this.name;
    }
}
