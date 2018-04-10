/**
 * @author Sylvia Chan A stack class that use generic type list
 * @param <T>
 */
public class MyStack<T> {
    private MyNode head;

    public MyStack() {
        head = null;
    }

    /**
     * @param data Create a new node and put it at the top of the stack
     */
    public void push(T data) {
        MyNode node = new MyNode(data);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    /**
     * Remove the top node and return it
     * @return Node being poped
     * @throws MyEmptyStackException when the list is empty
     */
    public T pop() throws MyEmptyStackException {
        MyNode current = null;

        if (isEmpty()) {
            throw new MyEmptyStackException("The stack is empty");
        }

        if (head.next != null) {
            current = head;
            head = current.next;
        } else {
            current = head;
            head = null;
        }

        return current.data;
    }

    /**
     * Check if the List is empty
     * @return if list is empty
     */
    public boolean isEmpty() {
        return (head == null) ? true : false;
    }

    /**
     * Create a new Node
     * @author Sylvia Chan
     */
    private class MyNode {

        private MyNode next = null;
        private T data;

        public MyNode(T data) {
            this.data = data;
        }
    }

}
