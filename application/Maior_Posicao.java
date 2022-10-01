package application;

import java.util.Locale;
import java.util.Scanner;

public class Maior_Posicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		
		double highest_value = vect[0];
		int position = 0;
		for(int i=1; i<vect.length; i++) {
			if(vect[i] > highest_value) {
				highest_value = vect[i];
				position = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f%n", highest_value);
		System.out.println("POSIÇÃO DO MAIOR VALOR =  " + position);		
		
		sc.close();
	}

}
