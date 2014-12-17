
public class Knjizara {
	private String ime;
	// CR: Space viska
	private Knjiga []  nizKnjiga;
	private int brojKnjiga;

	public Knjizara(String novoIme,Knjiga [] nizKnjiga){
		ime=novoIme;
		nizKnjiga=new Knjiga [10];
	}
	public Knjizara(){
		ime="Svjetlost";
		// CR: Ne stavlja se space nakon Knjiga
		nizKnjiga=new Knjiga [10];
	}
	public Knjizara(Knjizara other){
		this.ime=other.ime;
		// CR: Spaceovi iza ; i oko =
		for (int i =0;i<brojKnjiga;i++){
			this.nizKnjiga[i]=other.nizKnjiga[i];

		}

	}
	// CR: Jedan space nakon []
	public Knjiga []  resize(Knjiga[]nizKnjiga){
		Knjiga [] 	prosireniNiz = new Knjiga [nizKnjiga.length*2];
		for (int i =0;i<brojKnjiga;i++){
			prosireniNiz[i]=nizKnjiga[i];
		}
		nizKnjiga=prosireniNiz;
		return nizKnjiga;
	}
	public Knjiga[] dodajKnjigu(String naziv,int cijena,int stanje, Autor autor){
		// CR: Nema space nakon naziva klase
		nizKnjiga[brojKnjiga]= new Knjiga ( naziv,cijena,stanje,autor);
		brojKnjiga++;
		if (brojKnjiga==nizKnjiga.length){
			resize(nizKnjiga);
		}
		return nizKnjiga;
	  // CR: Pobrisati newline ovjde nema potrebe za tim


	}
	public Knjiga[] oduzmiJebenuKnjigu(String naziv,int cijena,int stanje, Autor autor){
		// CR: Knjiga[]noviNiz => Knjiga [] noviNiz
		Knjiga[]noviNiz=new Knjiga[nizKnjiga.length];
		for (int i =0;i<brojKnjiga;i++){
			// CR: nizKnjiga[i].getAutor()!=autor nece raditi jer nisi implementirao != operator za autor-a
			// ali zato jesi implementirao equals()
			// Tako koristi !nizKnjiga[i].equals(autor)
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
