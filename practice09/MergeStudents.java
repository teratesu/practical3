package practice09;

import java.util.ArrayList;
import java.util.Collections;

public class MergeStudents {
    public static ArrayList<Student> merge(ArrayList<Student> first, ArrayList<Student> second) {
        ArrayList<Student> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < first.size() && j < second.size()) {
            if (first.get(i).compareTo(second.get(j)) <= 0) {
                result.add(first.get(i));
                i++;
            } else {
                result.add(second.get(j));
                j++;
            }
        }

        while (i < first.size()) {
            result.add(first.get(i));
            i++;
        }

        while (j < second.size()) {
            result.add(second.get(j));
            j++;
        }

        return result;
    }

    public static void printList(String title, ArrayList<Student> students) {
        System.out.println(title);
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Student> first = new ArrayList<>();
        first.add(new Student("Иван Петров", 4.5));
        first.add(new Student("Анна Смирнова", 4.9));
        first.add(new Student("Олег Кузнецов", 3.8));

        ArrayList<Student> second = new ArrayList<>();
        second.add(new Student("Мария Иванова", 4.2));
        second.add(new Student("Павел Соколов", 4.7));
        second.add(new Student("Елена Морозова", 4.0));

        Collections.sort(first);
        Collections.sort(second);

        printList("Первый список (отсортирован):", first);
        printList("Второй список (отсортирован):", second);

        ArrayList<Student> merged = merge(first, second);

        printList("Объединенный отсортированный список:", merged);
    }
}
