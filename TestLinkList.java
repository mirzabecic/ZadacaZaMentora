import java.util.Iterator;

import java.util.LinkedList;

public class TestLinkList {
	public static void main(String[] args) {

		LinkList<Object> ll = new LinkList<Object>();
		ll.add(10);
		ll.add(9);
		ll.add(8);
		ll.add(7);
		ll.add(6);
		ll.add(5);
		Iterator<Object> benjo = ll.iterator();
		while (benjo.hasNext()) {
			System.out.print(benjo.next() + ", ");
		}
		// System.out.println(ll.getAt(5));

		// ll.removeAt(2);

		// System.out.println(ll.contains(5));

		// System.out.println(ll.getAt(5));
		LinkList<Integer> ll2 = new LinkList<Integer>();
		ll2.add(4);
		ll2.add(3);
		ll2.add(2);
		ll2.add(1);
		ll2.add(0);
		Iterator<Integer> njobe = ll2.iterator();
		while (njobe.hasNext()) {
			System.out.print(njobe.next() + ", ");
		}
	}
}
