package application;

import java.util.Locale;
import java.util.Scanner;

public class Media_Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		double avg = 0.0;
		int count = 0;
		for(int i=0; i<vect.length; i++) {
			if(vect[i]%2 == 0) {
				avg += vect[i];
				count++;
			}
		}
		
		if(count > 0) {
			avg = avg / (count * 1.0);
			System.out.printf("MÉDIA DOS PARES = %.1f", avg);
		}
		else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		sc.close();
	}

}
