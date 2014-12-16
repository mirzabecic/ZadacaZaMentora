
public class Pjesma {
	private String naziv;
	private double duzina;
	private Autor autor;
	
	public Pjesma(String noviNaziv,double novaDuzina,Autor noviAutor){
		naziv=noviNaziv;
		duzina=novaDuzina;
		autor=noviAutor;
	}
	 public Pjesma(){
		 naziv="Skim si me nocas vavala";
		 duzina=3.14;
		 autor=new Autor();
	 }
	 public Pjesma(Pjesma other){
		 this.naziv=other.naziv;
		 this.duzina=other.duzina;
		 this.autor= new Autor(other.autor);
	 }
	 public String toString (){
		 String ispis="";
		 ispis="naziv numere;" + naziv + "\nduzina trajanja:" + duzina + "\nautor:" + autor.getIme();
		 return ispis;
	 }
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public double getDuzina() {
		return duzina;
	}
	public void setDuzina(double duzina) {
		this.duzina = duzina;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	 

}
