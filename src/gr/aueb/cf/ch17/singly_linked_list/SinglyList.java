package gr.aueb.cf.ch17.singly_linked_list;

public class SinglyList<T> {
    private Node<T> head = null;


    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        head = tmp;
    }

    public void insertLast(T t) {
        if (isEmpty()) {
            insertFirst(t);
            return;
        }

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);

        Node<T> n;
        for (n = head; n.getNext() != null; n = n.getNext());
        n.setNext(tmp);
    }

    public boolean isEmpty() {
        return head == null;
    }


}
