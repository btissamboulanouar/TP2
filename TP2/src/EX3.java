import java.util.Scanner;
public class EX3 {
	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer la valeur de N : ");
		        int N = l.nextInt();
		        double somme = 0;
		        for (int i = 1; i <= N; i++) {
		            somme += 1.0 / i;
		        }
		        System.out.println("La somme des " + N + " premiers termes de la série harmonique est : " + somme);
		        l.close();
		    }
	}
