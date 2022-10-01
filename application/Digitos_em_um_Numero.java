package application;

import java.util.Scanner;

public class Digitos_em_um_Numero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o n�mero: ");
		int x = sc.nextInt();
		
		System.out.print("Digite o n�mero a ser encontrado: ");
		int a = sc.nextInt();
		int count = 0;
		
		while(x > 0) {
			int temp = x % 10;
			x /= 10;
			count++;
			if(temp == a) {
				System.out.println("Posi��o do n�mero: " + count);
			}
		}
				
		count = 0;
		while(x > 0) {
			x /= 10;
			count ++;
		}
		
		System.out.println("N�mero de d�gitos: " + count);
		
		sc.close();
	}

}
