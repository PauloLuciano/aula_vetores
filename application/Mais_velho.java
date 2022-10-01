package application;

import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		for(int i=0; i<name.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
		}
		
		int temp = 0;
		int older = age[0];
		
		for(int i=1; i<age.length; i++) {
			if(age[i] > older) {
				older = age[i];
				temp = i;
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + name[temp]);
				
		sc.close();
	}

}
