public class CircularyLinkedlist<E> {
    //هذه محاضرة يوم الاثنين تاريخ 1\3\2021
    private Node<E> tail =null;
    private int size =0;
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E element ,Node<E> next){
            this.element =element;
            this.next=next;
        }
        public E getElement(){
            return element;
        }
        public void setElement(E element){
            this.element=element;
        }
        public Node<E> getNext(){return next;}


    }
    public boolean isEmpty (){
        return size==0;
    }
    public int size (){
        return size;
    }
    public E frist (){
        if (isEmpty()) return null;
        return tail.getNext().getElement();
    }

}
