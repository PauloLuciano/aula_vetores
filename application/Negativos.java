package application;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		int[] vector = new int[n];
		
		for(int i=0; i<vector.length; i++) {
			sc.nextLine();
			System.out.print("Digite um número: ");
			vector[i] = sc.nextInt();			
		}
		System.out.println("NÚMEROS NEGATIVOS:");
		for(int i=0; i<vector.length; i++) {
			if(vector[i]<0) {
				System.out.println(vector[i]);
			}
		}
		
		sc.close();
	}

}
