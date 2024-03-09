import java.util.Scanner;
public class EX5 {
	public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer un nombre entier (n) : ");
		        int n = l.nextInt();
		        int resultatWhile = 1;
		        int iWhile = 1;

		        while (iWhile <= n) {
		            resultatWhile *= iWhile;
		            iWhile++;
		        }

		        System.out.println("Avec une boucle while, " + n + "! = " + resultatWhile);
                //avec une boucle for
		        int resultatfor = 1;
                 for (int i = 1; i <= n; i++) {
		            resultatfor *= i;
		        }
		        System.out.println("Avec une boucle for, " + n + "! = " + resultatfor);
		        l.close();
		    }
	}
