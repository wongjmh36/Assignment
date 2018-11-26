public class TestLinkedList {

    public static void main(String args[]) {
        LinkedList s = new LinkedList();
        System.out.println(s);
        System.out.println();

        s.addToTail(new Integer(30));
        System.out.println(s);
        System.out.println();
        s.addToTail(new Character('J'));
        System.out.println(s);
        System.out.println();
        s.addToTail(new String("ason"));
        System.out.println(s);
        System.out.println();
        while (!s.isEmpty()) {
            System.out.println("removed:" + s.removeFromTail());
            System.out.println(s);
            System.out.println();
        }
    }
} // class TestLinkedList
