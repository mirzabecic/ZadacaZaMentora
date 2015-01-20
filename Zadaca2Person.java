import java.io.Serializable;


public class Zadaca2Person implements Serializable {
	private String atributIme;
	private int atributGodine;
	
	
	public Zadaca2Person(String name, int age){
		this.atributIme = name;
		this.atributGodine = age;
	}
	public String toString(){ 
		String string ="";	
		string = "{atribut1:<" + atributIme + ">," + "atribut2:<"  + atributGodine + ">}" ;
		return string;
		
		
	}

}
