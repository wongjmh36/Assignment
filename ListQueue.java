
class EmptyQueueException extends RuntimeException {

    public EmptyQueueException() {
        super("Queue is empty");
    }
}
class QueueFullException extends RuntimeException {

    public QueueFullException() {
        super("Queue is full");
    }
}

class ListQueue extends LinkedList {

    public ListQueue() {
        super();
    }

    public boolean empty() {
        return isEmpty();
    }

    public void enqueue(Object item) throws QueueFullException {
        addToTail(item);
    }


public Object dequeue() throws EmptyQueueException {
        if (empty()) {
            throw new EmptyQueueException();
        }
        return (removeFromHead());
    }

}
