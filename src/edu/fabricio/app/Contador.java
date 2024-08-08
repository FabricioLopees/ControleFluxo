package edu.fabricio.app;
import java.util.Scanner;

public class Contador{
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número:");
		int primeiroNumero = scan.nextInt();
		
		System.out.println("Digite outro número:");
		int segundoNumero = scan.nextInt();
		
		scan.close();
		
		
		// TEST
		
		System.out.println("Os número digitados são:"+primeiroNumero+" e "+segundoNumero);
	}
	
}