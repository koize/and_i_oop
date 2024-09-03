public class Main3 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.append(8);
        list.append(9);
        list.append(10);
        System.out.println(list);
    }


}

class MyLinkedList<E> {
    Node<E> head = null;
    Node<E> tail = null;
    Node<E> current = null;
    Node<E> newNode;

    public void append(E x) {
        newNode = new Node<E>(x);
        if (head == null) {
            // for very first mode
            head = newNode;
            tail = head;
        } else {
            current = head;
            // track down to tail node
            while (current.next != null)
                current = current.next;
            // add in the new node
            current.previous = current;
            current.next = newNode;
            tail = newNode;
        }
    }

    public String toString() {
        String s = "";
        current = head;
        while (current != null) {
            s += current.data.toString();
            current = current.next;
        }
        return (s);

    }
}

class Node<E> {
    E data;
    Node<E> next = null;
    Node<E> previous = null;
    Node(E data) {
        this.data = data;
    }
}
