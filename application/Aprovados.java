package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Aprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		Student[] student = new Student[n];
		
		for(int i=0; i<student.length; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", (i+1));
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			double avg = (grade1 + grade2) / 2.0;
			student[i] = new Student(name, grade1, grade2, avg);
		}
		
		System.out.println("Alunos aprovados: ");
		for(int i=0; i<student.length; i++) {
			if(student[i].getAvg() >= 6.0) {
				System.out.println(student[i].getName());
			}
		}
	
	sc.close();
	}

}
