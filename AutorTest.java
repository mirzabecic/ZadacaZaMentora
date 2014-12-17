
public class AutorTest {
	public static void main(String[] args) {

		/*
		* CR: Nisi komitao clasu Autor
		*/

		/*
		* CR: Voditi racuna o 'spaceovima' tako npr linija ispod
		*
		* Autor mirza = new Autor("mirza", "mirza.sdsads@hotmail.com", "m");
		*
		* Znakovi:
		*
		* =  -> Sa obje strane ide SPACE
		* ,  -> Nakon zareza uvijek ide SPACE
		*/

		Autor mirza= new Autor("mirza", " mirza.sdsads@hotmail.com", "m");
		Autor davor= new Autor("davor", "davor.asdsa@hotmail.com","z");
		davor.setIme("hafir");

		Knjiga prva= new Knjiga();
		System.out.println(prva);
		System.out.println(mirza);
		//System.out.println(mirza.getIme());
	}
}
