package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {

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
		System.out.print("VALORES = ");
		for(int i=0; i<vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.println();
		double sum = 0.0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		System.out.printf("SOMA = %.2f%n", sum);
		
		double avg = sum / (vect.length * 1.0);
		System.out.printf("MÉDIA = %.2f%n", avg);
	}

}
