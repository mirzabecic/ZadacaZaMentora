
public class TestKrug {
	public static void main(String[] args) {
		Tacka t1= new Tacka(3,2);
		Tacka t2= new Tacka(4,2);
		Krug k1= new Krug(t1,2);
		Krug k2= new Krug(t2,3);
		System.out.println(k1.equals(k2));
		System.out.println(k1.toString());
		
	}

}
