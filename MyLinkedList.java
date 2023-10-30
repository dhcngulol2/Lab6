package BaiTH6;

public class MyLinkedList<E> {
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size;

	public MyLinkedList() {
		super();
	}

	public int size() {

		return size;
	}

	public boolean isEmty() {
		return size == 0;

	}

	public E fist() {
		if (size == 0) {
			return null;
		}
		return head.getData();
	}

	public E last() {
		if (size == 0) {
			return null;
		}
		return tail.getData();
	}

	public void addFist(E e) {
		Node<E> newNode = new Node<>(e, head);
		head = newNode;
		if (size == 0) {
			head = tail;
		}

	}

	public void addLast(E e) {
		Node<E> newNode = new Node<>(e, null);
		tail = newNode;
		if (size == 0) {
			tail= head  ;
		}
	}
	public E removeFirst() {
	    if (size==0) {
	        return null;
	    }

	    E oldValue = head.getData();
	    head = head.getNext();
	    size--;

	    if (size==0 ) {
	        tail = null;
	    }

	    return oldValue;
	}
	public E removeLast() {
		if (size==0 ) { 
			return null ;
		}
		E OldValue ;
		if (size ==1 ) {
			OldValue = head.getData();
			head = null;
			tail = null ;
			size--;
			return OldValue;
		}
		Node<E> current = head;
		while (current.getNext() != tail) {
			current = current.getNext();
		}
		OldValue = tail.getData();
		current.setNext(null);
		tail = current;
		size--;
		return OldValue ;
	}
	
}
