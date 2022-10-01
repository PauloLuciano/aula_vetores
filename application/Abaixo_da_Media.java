package application;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_Media {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		
		double sum = 0.0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i];
		}
		
		double arithmetic_average = sum/(vect.length * 1.0);
		System.out.printf("MÉDIA DO VETOR = %.3f%n", arithmetic_average);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for(int i=0; i<vect.length; i++) {
			if(vect[i] < arithmetic_average) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
	}

}
