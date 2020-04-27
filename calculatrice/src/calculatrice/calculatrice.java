package calculatrice;
import java.util.Scanner;
public class calculatrice {

	static Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
		int nbre1= 0, nbre2= 0;
		
		System.out.println("Veuillez entrer le premier nombre:");
		nbre1 = clavier.nextInt();
		
		System.out.println("Veuillez entrer le second nombre:");
		nbre2 = clavier.nextInt();
		
		System.out.println("La somme de " + nbre1 + " et " + nbre2 + " est: " + (nbre1+nbre2));
		System.out.println("La difference entre " + nbre1 + " et " + nbre2 + " est: " + (nbre1-nbre2));
		System.out.println("Le produit de " + nbre1 + " et " + nbre2 + " est: " + (nbre1*nbre2));
		System.out.println("La division de " + nbre1 + " par " + nbre2 + " est: " + (nbre1/nbre2));
		
	
	}
	
}
