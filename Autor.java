//zadatak Kreirati klasu autor, koji ima svoje ime mail i spol, kreirati gettere,settere,toString metodu,zatim i drugu metodu AutorTest gdje ce se sve testirati
public class Autor {
	private String ime;
	private String mail;
	private String spol;
	
	
	
	public Autor(String postaviIme, String postaviMail,String postaviSpol){
		ime= postaviIme;
		mail=postaviMail;
		spol=postaviSpol;
	}
	public Autor(){
		ime = "sefik";
		mail="safir.loody@hotmail.com";
		spol="m";
	}
	public Autor(String novoIme){
		ime=novoIme;
	}
	public Autor(Autor other){
		this.ime=other.ime;
		this.mail=other.mail;
		this.spol=other.spol;
	}
	public String getIme(){
		return ime;
	}
	public String getMail(){
		return mail;
	}
	public String getSpol() {
		
		return spol;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public void setMail(String mail) {
		boolean random=false;
		for ( int i =0;i<mail.length();i++){
			if (mail.charAt(i)=='@'){
				random=true;
			}
			
		}
		if (random==true){
			this.mail = mail;
		}else{
			throw new IllegalArgumentException("Levatu napisi email, ko ti dade da sjednes za racunar");
		}
		
		
		
	}
	public void setSpol(String spol) {
	       if ((spol!="m") && (spol!="z") && (spol!="M") && (spol!="Z")) {
				throw new IllegalArgumentException("Ili jesi ili nisi lav");
			}
			this.spol = spol;
		}
	public String toString(){
		String ispis="";
		ispis=" ime: " + ime + "\nmail:" + mail + "\nspol:" + spol;
		return ispis;
	}
	public boolean equals  (Autor other){
		if ((this.ime == other.ime) && (this.mail==other.mail) && (this.spol==other.spol)){
			return true;
		}else{
			return false;
		}
	}
	
	

}
