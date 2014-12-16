
public class AutorTest {
	public static void main(String[] args) {
		Autor mirza= new Autor("mirza", " mirza.sdsads@hotmail.com", "m");
		Autor davor= new Autor("davor", "davor.asdsa@hotmail.com","z");
		davor.setIme("hafir");
	
		Knjiga prva= new Knjiga();
		System.out.println(prva);
		System.out.println(mirza);
		//System.out.println(mirza.getIme());
	}

}
