package practice17;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void readFromConsole(Scanner scanner) {
        System.out.print("Введите имя: ");
        name = scanner.nextLine();
        System.out.print("Введите возраст: ");
        age = scanner.nextInt();
        scanner.nextLine();
    }

    public void print() {
        System.out.println("Имя: " + name + ", возраст: " + age);
    }

    @Override
    public String toString() {
        return name + " (возраст " + age + ")";
    }
}
