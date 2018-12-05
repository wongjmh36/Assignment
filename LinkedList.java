
class EmptyListException extends RuntimeException {

    public EmptyListException() {
        super("List is empty");
    }
}

public class LinkedList {

    class ListNode {

        private Object data;
        ListNode next;

        public ListNode(Object o) {
            data = o;
            next = null;
        }

        public ListNode(Object o, ListNode nextNode) {
            data = o;
            next = nextNode;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object o) {
            data = o;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

    } // class ListNode

    protected ListNode head;
    protected ListNode tail;
    protected int length;
    protected int position = 1;

    public LinkedList() {
        head = tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int search(Object item) {

        ListNode current = head;    //Initialize current 
        while (current != null) {
            if (current.getData() == item) {
                return position;
            }
            current = current.getNext();
            position++;
        }
        return 0;
    }

    public void addToHead(Object item) {
        if (isEmpty()) {
            head = tail = new ListNode(item);
        } else {
            head = new ListNode(item, head);
        }
        length++;
    }

    public void addToTail(Object item) {
        if (isEmpty()) {
            head = tail = new ListNode(item);
        } else {
            tail.setNext(new ListNode(item));
            tail = tail.getNext();
        }
        length++;
    }

    public Object removeFromHead() throws EmptyListException {
        Object item = null;
        if (isEmpty()) {
            throw new EmptyListException();
        }
        item = head.getData();
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.getNext();
        }
        length--;
        return item;
    }

    public Object removeFromTail() throws EmptyListException {
        Object item = null;
        if (isEmpty()) {
            throw new EmptyListException();
        }
        item = tail.getData();
        if (head == tail) {
            head = tail = null;
        } else {
            ListNode current = head;
            while (current.getNext() != tail) {
                current = current.getNext();
            }
            tail = current;
            current.setNext(null);
        }
        length--;
        return item;
    }

    public String toString() {
        String str = "[ ";
        ListNode current = head;
        while (current != null) {
            str = str + current.getData() + " ";
            current = current.getNext();
        }
        return str + " ]";
    }

    public int count() {
        return length;
    }
}
