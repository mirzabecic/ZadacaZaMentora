public class LinkList<T> {
	@SuppressWarnings("unused")
	private Node head;

	public LinkList() {
		this.head = head;
	}
// creating node
	@SuppressWarnings({ "unused", "hiding" })
	private class Node<T> {
		T value;
		@SuppressWarnings("rawtypes")
		Node next;

		public Node(T value) {
			this.value = value;
		}
	}
// creating method that will add new nods
	public void add(T value) {
		Node newNode = new Node(value);
		if (this.head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
		
	}
	// removing nods from the list
	public void removeAt(int index){
		if (index == 0){
			head = head.next;
			
		}
		int counter = 1;
		Node previous = head;
		Node current = head.next;
		while(counter != index){
			current = current.next;
			previous = previous.next;
			
			counter++;
		}
		previous.next = current.next;
		current.next = null;
		
	}
	//gets size of list
	public int getSize(){
		Node current = head;
		int counter = 0;
		while (current.next != null){
			current = current.next;
			counter++;
		}
		return counter;
	}
	//writes the list out
	public String toString(){
		String ispis = "";
		Node newNode = head;
		while (newNode != null){
			ispis += newNode.value;
			ispis += "\n";
			newNode = newNode.next;
			
			}
		return ispis;
	}

}
