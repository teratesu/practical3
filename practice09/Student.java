package practice09;

public class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        if (gpa < other.gpa) {
            return 1;
        }
        if (gpa > other.gpa) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name + " (средний балл " + gpa + ")";
    }
}
