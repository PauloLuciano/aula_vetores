package application;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		double[] height = new double[n];
		char[] genre = new char[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("Altura da %da pessoa: ", (i+1));
			height[i] = sc.nextDouble();
			System.out.printf("Gênero da %da pessoa: ", (i+1));
			genre[i] = sc.next().charAt(0);
		}
		
		double shorter = height[0];
		for(int i=1; i<height.length; i++) {
			if(height[i] < shorter) {
				shorter =  height[i];
			}
		}
		System.out.printf("Menor altura = %.2f%n", shorter);
		
		double larger = height[0];
		for(int i=1; i<height.length; i++) {
			if(height[i] > larger) {
				larger = height[i];				
			}
		}
		System.out.printf("Maior altura: %.2f%n", larger);
		
		double sum = 0.0;
		int count = 0;
		for(int i=0; i<height.length; i++) {
			if(genre[i] == 'F') {
				sum += height[i];
				count++;
			}
		}
		double avg = sum / (count * 1.0);
		System.out.printf("Média das alturas das mulheres = %.2f%n", avg);
		
		System.out.println("Número de homens = " + (n - count));
		
		sc.close();
	}

}
