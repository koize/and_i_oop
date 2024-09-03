public class MyLinkedList<E> {
    Node<E> head = null;
    Node<E> current = null;
    Node<E> newNode;
    public void append (E x){
        newNode = new Node<E> (x);
        if (head==null) {
            // for very first mode
            head = new Node<>(x);
        }
        else {
            current = head;
            // track down to tail node
            while (current.next != null)
                current = current.next;
            // add in the new node
            current.next = newNode;
        }
    }
    public String toString (){
        String s="";
        current = head;
        while ((current != null)) {
            s += current.data.toString();
            current = current.next;
        }
        return(s);
    }

    public int size(){
        int i = 0;
        current = head;
        while (current.next != null) {
            current = current.next;
            i++;
        }
       return i;
    }

    public int remove(int index){
        if (index >= size() || index < 0) {
            return -1;
        }
        if (index == 0) {
            current = head;
            head = head.next;
            current.data = null;
            return 0;
        }

        current = head;
        int i = 0;
        Node<E> previous = null;
        Node<E> next = null;

        while (i < index) { //stop before i = index, will end up at correct positiono
            previous = current;
            current = current.next;
            next = current.next;
            i++;
        }

        previous.next = next; //skip current, will get deleted
        current.data = null;
        return 0;


    }
}
class Node<E> {
    E data;
    Node<E> next = null;
    Node (E data) { this.data = data; }
}
