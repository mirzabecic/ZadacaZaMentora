


public class TestLinkList {
	public static void main(String[] args) {
		LinkList<Integer> ll = new LinkList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.removeAt(1);
		System.out.println(ll.toString());
		
	}

}
