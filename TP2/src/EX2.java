import java.util.Scanner;
public class EX2 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer la base (X) : ");
		        int X = l.nextInt();
		        System.out.print("Veuillez entrer l'exposant (N) : ");
		        int N = l.nextInt();
		        long resultat = 1;
		        for (int i = 1; i <= N; i++) {
		            resultat *= X;
		        }
		        System.out.println(X + "^" + N + " = " + resultat);
		        l.close();
		    }

}
