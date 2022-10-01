package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		Person[] person = new Person[n];
		
		for(int i=0; i<person.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa: %n", (i+1));
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			person[i] = new Person(name, age, height);
		}
		System.out.println();
		
		double height_sum = 0.0;
		for(int i=0; i<person.length; i++) {
			height_sum += person[i].getHeight();
		}
		double height_avg = height_sum / (person.length * 1.0);
		System.out.printf("Altura média: %.2f%n", height_avg);
		
		int count = 0;
		for(int i=0; i<person.length; i++) {
			if(person[i].getAge() < 16) {
				count++;
			}
		}
		double percentage = ((count * 1.0) / (person.length * 1.0)) * 100.0;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentage);
		
		for(int i=0; i<person.length; i++) {
			if(person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}
		}
		
		sc.close();
	}

}
