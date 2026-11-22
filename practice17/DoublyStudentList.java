package practice17;


public class DoublyStudentList {
    private DoublyNode head;
    private DoublyNode tail;

    public DoublyStudentList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Student student) {
        DoublyNode node = new DoublyNode(student);

        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    public Student get(int index) {
        DoublyNode current = head;
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

        DoublyNode current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            return false;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }

        return true;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        DoublyNode current = head;
        int number = 1;

        while (current != null) {
            System.out.println(number + ". " + current.data);
            current = current.next;
            number++;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        DoublyNode current = tail;
        int number = 1;

        while (current != null) {
            System.out.println(number + ". " + current.data);
            current = current.prev;
            number++;
        }
    }

    public void clear() {
        head = null;
        tail = null;
    }
}
