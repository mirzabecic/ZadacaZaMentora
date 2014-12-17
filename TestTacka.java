
public class TestTacka {
	public static void main(String[] args) {
		Tacka prva = new Tacka(1, 2);
		Tacka druga = new Tacka(4, 7);
		
		
		System.out.println(prva.getDistance(druga));
		System.out.println(prva.toString());
		System.out.println(druga.toString());
		System.out.println(prva.equals(druga));
		
	}

}
