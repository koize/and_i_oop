public class Main3 {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.append("A");
        list.append("B");
        list.append("C");
        list.append("D");
        System.out.println("tostring: " + list);
        System.out.println("size: " + list.size());
        System.out.println("remove code: " + list.remove(9));
        System.out.println("size: " + list.size());
        System.out.println("remove index 1: " + list);

    }

}

