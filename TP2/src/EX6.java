import java.util.Scanner;
public class EX6 {
	public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		     // Test si le nombre est premier
		        System.out.print("Veuillez entrer un nombre entier : ");
		        int nombre = l.nextInt();
		        boolean estPremier = true;
		        if (nombre <= 1) {
		            estPremier = false;
		        } else {
		            for (int i = 2; i <= Math.sqrt(nombre); i++) {
		                if (nombre % i == 0) {
		                    estPremier = false;
		                    break;
		                }
		            }
		        }
		        if (estPremier) {
		            System.out.println(nombre + " est un nombre premier.");
		        } else {
		            System.out.println(nombre + " n'est pas un nombre premier.");
		        }
		      //les nombres entre 1 et N
		        System.out.print("Veuillez entrer un nombre entier (N) : ");
		        int N = l.nextInt();
		        System.out.println("Nombres premiers entre 1 et " + N + " :");
		        for (int i = 1; i <= N; i++) {
		            boolean Premier = true;
		            if (i < 1) {
		                Premier = false;
		            } else {
		                for (int j = 2; j <= Math.sqrt(i); j++) {
		                    if (i % j == 0) {
		                       Premier = false;
		                        break;
		                    }
		                }
		            }

		            if (Premier) {
		                System.out.print(i + " ");
		            }
		        }
		        l.close();
		    }
}
