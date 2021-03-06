public class SinglyLinkedlist <E> {
    //محاضرة يوم الاثنين 22/2/2021
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public E frist() {
        if (isEmpty()) return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void AddFrist(E elemant) {
        head = new Node<E>(elemant, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void AddLast(E elemant) {
        Node<E> newst = new Node<E>(elemant, null);
        if (isEmpty())
            head = newst;
        else tail.setNext(newst);
        tail = newst;
        size++;
    }

    public E removFrist() {
        if (isEmpty()) return null;
        E deleted = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;

        }
        return deleted;

    }
    public String print(){
        Node<E> i =head;
        String all ="";
        while (i!=null){
            all=all+i.getElement().toString();
            i=i.getNext();
        }
        return all;
    }

    private static class  Node <E> {
        private E element;
        private Node <E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


}
