
public class Knjiga {
	private String naziv;
	private int cijena;
	private int stanje;
	private Autor autor;
	 
	public Knjiga (String noviNaziv,int novaCijena, int novoStanje,Autor noviAutor){
		naziv=noviNaziv;
		cijena=novaCijena;
		stanje=novoStanje;
		autor=noviAutor;
	}
	public Knjiga (){
		naziv="50 nijansi roze";
		cijena=30;
		stanje=5;
		autor=new Autor("FEHIM");
	}
	public Knjiga(Knjiga other){
		this.naziv=other.naziv;
		this.cijena=other.cijena;
		this.stanje=other.stanje;
		this.autor=new Autor(other.autor);
	}
	public String toString(){
		String ispis="";
		ispis="naziv:" + naziv + "\ncijena:" + cijena + "\nstanje:" + stanje + "\nautor:" + autor.getIme();
		return ispis;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getCijena() {
		return cijena;
	}
	public void setCijena(int cijena) {
		if (cijena<0){
			throw new IllegalArgumentException("Ne moze djaba");
		}
		this.cijena = cijena;
	}
	public int getStanje() {
		return stanje;
	}
	public void setStanje(int stanje) {
		if (stanje<0){
			throw new IllegalArgumentException("fuck you");
			
		}
		this.stanje = stanje;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor.setIme(autor.getIme());
		this.autor.setMail(autor.getMail());
		this.autor.setSpol(autor.getSpol());
	}
	public boolean equals1(Knjiga other){
		if ((this.naziv.equals(other.naziv)) && (this.cijena==other.cijena) && (this.stanje==other.stanje) && (this.autor.equals(other.autor))){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	

}
