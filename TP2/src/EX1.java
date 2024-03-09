import java.util.Scanner;
public class EX1 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer le nombre d'entiers (N) : ");
		        int N = l.nextInt();
		      //la boucle while
		        int s = 0;
		        long p= 1; 
		        double moyenne = 0;
		        System.out.println("Utilisation de la boucle while :");
		        int i = 0;
		        while (i < N) {
		            System.out.print("Entrez un entier : ");
		            int nombre = l.nextInt();
		            s += nombre;
		            p *= nombre;
		            i++;
		        }
		        moyenne = (double) s / N;
		        System.out.println("la somme est "+ s +" le produit est" + p +" la moyenne est" + moyenne);
		      //la boucle do while
		        s = 0;
		        p = 1;
		        moyenne = 0;
		        i = 0;
		        System.out.println("Utilisation de la boucle do-while :");
		        do {
		            System.out.print("Entrez un entier : ");
		            int nombre = l.nextInt();
		            s += nombre;
		            p *= nombre;
		            i++;
		        } while (i < N);
		        moyenne = (double) s / N;
		        System.out.println("la somme est "+ s +" le produit est" + p +" la moyenne est" + moyenne );
		        s = 0;
		        p = 1;
		        moyenne = 0;
		        //la boucle for
		        System.out.println("Utilisation de la boucle for :");
		        for (int j = 0; j < N; j++) {
		            System.out.print("Entrez un entier : ");
		            int nombre = l.nextInt();
		            s += nombre;
		            p *= nombre;
		        }
		        moyenne = (double) s / N;
		        System.out.println("la somme est "+ s +" le produit est" + p +" la moyenne est" + moyenne);
		        l.close();
		    }
	}
