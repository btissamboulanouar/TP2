import java.util.Scanner;
public class EX4 {
	public static void main(String[] args) {
		        Scanner l = new Scanner(System.in);
		        System.out.print("Veuillez entrer le nombre de lignes (N) : ");
		        int N = l.nextInt();
		        for (int i = 1; i <= N; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		        l.close();
	}
	}
