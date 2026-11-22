package practice17;


public class RingStudentList {
    private RingNode tail;

    public RingStudentList() {
        tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void add(Student student) {
        RingNode node = new RingNode(student);

        if (tail == null) {
            node.next = node;
            tail = node;
            return;
        }

        node.next = tail.next;
        tail.next = node;
        tail = node;
    }

    public Student get(int index) {
        if (tail == null) {
            return null;
        }

        RingNode current = tail.next;
        int i = 0;

        do {
            if (i == index) {
                return current.data;
            }
            current = current.next;
            i++;
        } while (current != tail.next);

        return null;
    }

    public boolean remove(int index) {
        if (tail == null) {
            return false;
        }

        RingNode previous = tail;
        RingNode current = tail.next;
        int i = 0;

        do {
            if (i == index) {
                if (current == tail && current.next == current) {
                    tail = null;
                } else {
                    previous.next = current.next;
                    if (current == tail) {
                        tail = previous;
                    }
                }
                return true;
            }
            previous = current;
            current = current.next;
            i++;
        } while (previous != tail);

        return false;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }

        RingNode current = tail.next;
        int number = 1;

        do {
            System.out.println(number + ". " + current.data);
            current = current.next;
            number++;
        } while (current != tail.next);
    }

    public void clear() {
        tail = null;
    }
}
