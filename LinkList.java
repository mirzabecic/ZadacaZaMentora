import java.util.Iterator;

public class LinkList<T> implements Iterable<T> {
	private Node head;

	public LinkList() {
		head = null;

	}

	public void add(T value) {

		Node newNode = new Node(value);

		if (head == null) {

			head = newNode;

			return;

		}

		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;

	}

	public void removeAt(int index) {
		if (index < 0 || index >= getSize())
			throw new IndexOutOfBoundsException("Index is not valid");

		if (index == 0) {
			head = head.next;
			return;
		}
		Node current = head.next;
		Node previous = head;
		int counter = 1;
		while (counter < index) {
			previous = current;
			current = current.next;
			counter++;
		}
		previous.next = current.next;
		current.next = null;
	}

	public boolean contains(T value) {
		if (head == null)
			throw new IllegalStateException("List is empty!");

		Node current = head;
		while (current.next != null) {

			if (current.value.equals(value))
				return true;
			current = current.next;
		}
		return false;
	}

	public T getAt(int index) {
		Node current = head;
		int counter = 0;
		if (head == null) {
			throw new IllegalStateException("List is empty!");
		}
		if (index < 0 || index > getSize()) {
			throw new IllegalStateException("Index is not valid!");
		} else {
			while (counter < index) {
				current = current.next;
				counter++;

			}
		}
		return (T) current.value;
	}

	public int getSize() {
		int size = 1;
		Node current = head;
		if (head == null) {
			return 0;
		} else {
			while (current.next != null) {
				current = current.next;
				size++;
			}
		}
		return size;
	}

	private class Node<T> {
		private T value;
		Node next;

		public Node(T value) {
			this.value = value;
			this.next = null;
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new Biterator<T>(head);
	}

	private class Biterator<T> implements Iterator<T> {
		private Node<T> current;

		public Biterator(Node start) {
			current = start;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			T value = current.value;
			current = current.next;
			return value;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
		}
	}
}