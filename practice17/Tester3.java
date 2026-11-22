package practice17;


import java.util.Scanner;

public class Tester3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RingStudentList list = new RingStudentList();
        int choice = -1;

        while (choice != 0) {
            System.out.println();
            System.out.println("=== Картотека студентов (кольцевой список) ===");
            System.out.println("1 - добавить студента");
            System.out.println("2 - удалить студента по номеру");
            System.out.println("3 - показать студента по номеру");
            System.out.println("4 - показать весь список");
            System.out.println("5 - очистить список");
            System.out.println("6 - проверить, пуст ли список");
            System.out.println("0 - выход");
            System.out.print("Выберите пункт: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Student student = new Student();
                    student.readFromConsole(scanner);
                    list.add(student);
                    System.out.println("Студент добавлен.");
                    break;
                case 2:
                    System.out.print("Введите номер: ");
                    if (list.remove(scanner.nextInt() - 1)) {
                        System.out.println("Студент удален.");
                    } else {
                        System.out.println("Нет студента с таким номером.");
                    }
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Введите номер: ");
                    Student found = list.get(scanner.nextInt() - 1);
                    scanner.nextLine();
                    if (found != null) {
                        found.print();
                    } else {
                        System.out.println("Нет студента с таким номером.");
                    }
                    break;
                case 4:
                    list.printAll();
                    break;
                case 5:
                    list.clear();
                    System.out.println("Список очищен.");
                    break;
                case 6:
                    System.out.println(list.isEmpty() ? "Список пуст." : "Список не пуст.");
                    break;
                case 0:
                    System.out.println("Выход.");
                    break;
                default:
                    System.out.println("Нет такого пункта меню.");
            }
        }
    }
}
