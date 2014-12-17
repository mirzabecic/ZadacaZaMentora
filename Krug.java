
public class Krug {
	private Tacka tacka;
	private double radiusKruga;
	
	
	
	
	public Krug(Tacka tacka, double radiusKruga){
		this.tacka = new Tacka(tacka);
		this.radiusKruga = radiusKruga;
	}
	public Krug(Krug other){
		this.tacka = other.tacka;
		this.radiusKruga = other.radiusKruga;
	}
	public int isInside(Tacka other){
		double udaljenost = tacka.getDistance(other) ;
		if(udaljenost>radiusKruga){
			return -1;
		}else if(udaljenost == radiusKruga){
			return 0;
		}else
			return 1;
			
		}
	
	public boolean equals(Krug other){
		if (this.tacka.equals(other.tacka)&& this.radiusKruga == other.radiusKruga)
			return true;
		return false;
		
	}
	public String toString (){
		String ispis="Centar:" + tacka.toString()+ "Radius;" + radiusKruga;
		return ispis;
		
	}
	
}
