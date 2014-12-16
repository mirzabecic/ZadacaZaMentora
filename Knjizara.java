
public class Knjizara {
	private String ime;
	private Knjiga []  nizKnjiga;
	private int brojKnjiga;
	
	public Knjizara(String novoIme,Knjiga [] nizKnjiga){
		ime=novoIme;
		nizKnjiga=new Knjiga [10];
	}
	public Knjizara(){
		ime="Svjetlost";
		nizKnjiga=new Knjiga [10];
	}
	public Knjizara(Knjizara other){
		this.ime=other.ime;
		for (int i =0;i<brojKnjiga;i++){
			this.nizKnjiga[i]=other.nizKnjiga[i];
			
		}
		
	}
	public Knjiga []  resize(Knjiga[]nizKnjiga){
		Knjiga [] 	prosireniNiz = new Knjiga [nizKnjiga.length*2];
		for (int i =0;i<brojKnjiga;i++){
			prosireniNiz[i]=nizKnjiga[i];
		}
		nizKnjiga=prosireniNiz;
		return nizKnjiga;
	}
	public Knjiga[] dodajKnjigu(String naziv,int cijena,int stanje, Autor autor){
		nizKnjiga[brojKnjiga]= new Knjiga ( naziv,cijena,stanje,autor);
		brojKnjiga++;
		if (brojKnjiga==nizKnjiga.length){
			resize(nizKnjiga);
		}
		return nizKnjiga;
	
	
		
	}
	public Knjiga[] oduzmiJebenuKnjigu(String naziv,int cijena,int stanje, Autor autor){
		Knjiga[]noviNiz=new Knjiga[nizKnjiga.length]; 
		for (int i =0;i<brojKnjiga;i++){
			if (nizKnjiga[i].getNaziv()!=naziv && nizKnjiga[i].getCijena()!=cijena && nizKnjiga[i].getStanje()!=stanje && nizKnjiga[i].getAutor()!=autor){
				noviNiz[i]=nizKnjiga[i];
				
			}
			
		}
		nizKnjiga=noviNiz;
		return nizKnjiga;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	
	
	

}
