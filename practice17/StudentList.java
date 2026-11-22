package practice17;


public class StudentList {
    private Node head;

    public StudentList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Student student) {
        Node node = new Node(student);

        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public Student get(int index) {
        Node current = head;
        int i = 0;

        while (current != null) {
            if (i == index) {
                return current.data;
            }
            current = current.next;
            i++;
        }

        return null;
    }

    public boolean remove(int index) {
        if (head == null) {
            return false;
        }

        if (index == 0) {
            head = head.next;
            return true;
        }

        Node current = head;
        int i = 0;

        while (current.next != null && i < index - 1) {
            current = current.next;
            i++;
        }

        if (current.next == null) {
            return false;
        }

        current.next = current.next.next;
        return true;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        Node current = head;
        int number = 1;

        while (current != null) {
            System.out.println(number + ". " + current.data);
            current = current.next;
            number++;
        }
    }

    public void clear() {
        head = null;
    }
}
