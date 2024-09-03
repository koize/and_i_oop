public class Main3 {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.append("a");
        list.append("b");
        list.append("c");
        list.append("d");
        list.append("e");
        System.out.println("original list: " + list);
        System.out.println("size: " + list.size());
        System.out.println("remove index 1, code: " + list.remove(4));
        System.out.println("new size: " + list.size());
        System.out.println("new list: " + list);


    }
}

class MyLinkedList<E> {
    Node<E> head = null;
    Node<E> current = null;
    Node<E> newNode;
    public void append (E x){
        newNode = new Node<E> (x);
        if (head == null) {
            head = new Node<>(x);
        }
        else {
            current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }
    public String toString(){
        String s="";
        current = head;
        while (current != null){
            s += current.data.toString();
            current = current.next;
        }
        return (s);
    }

    public int size(){
        current = head;
        int i = 0;
        while (current != null){
            i++;
            current = current.next;
        }
        return i;
    }

    public int remove (int index) {
        Node<E> previous = null;
        Node<E> next = null;
        if (index < 0 || index >= size()) {
            return -1;
        }
        if (index == 0) {
            current = head;
            head = head.next; //set new head
            current = null; //set current head to null (to delete)
            return 0;
        }
        int i = 0;
        current = head;
        while (i<index){ //inc until index found
            previous = current; //set prev to current for next iteration
            current = current.next; //set current to next for next iteration
            next = current.next; //set next to next next for next iteration
            i++;
        }
        if (previous != null) {
            previous.next = next; //set prev to next to skip current (which will get deleted)
        }
        current = null; // delete

        return 0;
    }
}

class Node<E> {
    E data;
    Node<E> next = null;
    Node(E data) {
        this.data = data;
    }
}
