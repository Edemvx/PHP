package rect;

public class Rectangle {
	public Double Longueur;
	public Double Largeur;

public Rectangle(Double L,Double l) {
	this.Longueur=L;
	this.Largeur=l;
    }

public Double surface() {
	return this.Longueur*this.Largeur;
}

public Double perimetre() {
	return 2*(this.Longueur+this.Largeur);
}

public Double dperimetre() {
	return this.Longueur+this.Largeur;
}

public void afficher() {
	System.out.println("La surface du rectangle est : " + this.surface());
	System.out.println("Le perimetre du rectangle est : " + this.perimetre());
	System.out.println("Le demi-perimetre du rectangle est : " + this.dperimetre());
}
}
