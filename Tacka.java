
public class Tacka {
	private int x1;
	private int y1;
	
	
	
	public Tacka(int postaviX1, int postaviY1){
		x1 = postaviX1;
		y1 = postaviY1;
		
		
	}
	public Tacka(Tacka other){
		this.x1 = other.x1;
		this.y1 = other.y1;
		
	}
	public double getDistance(Tacka other){
		double rezultat = Math.sqrt((this.x1 - other.x1) * (this.y1 - other.y1));
		return rezultat;
		
	}
	public String toString(){
		String ispis = "(" + this.x1 + "," + this.y1 + ")";
		return ispis;
	}
	public boolean equals(Tacka other){
		if((this.x1 == other.x1) && (this.y1 == other.y1))
		return true;
				return false;
	}

}
