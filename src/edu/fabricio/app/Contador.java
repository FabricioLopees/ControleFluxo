package edu.fabricio.app;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador{
	public static void main(String[] args) throws ParametrosInvalidosException {
		try {
			// Obtém os números do usuário
			
			Scanner scan = new Scanner(System.in);

			System.out.println("Digite um número:");
			int primeiroNumero = scan.nextInt();
			
			System.out.println("Digite outro número:");
			int segundoNumero = scan.nextInt();
			
			scan.close();
			
			// Executa teste se o primeiro número é maior que o segundo número
			
			if(primeiroNumero > segundoNumero) {
				throw new ParametrosInvalidosException();
			}
		} catch (ParametrosInvalidosException parametrosInvalidos) {
			parametrosInvalidos.dispararErro();
		} catch (InputMismatchException e) {
			System.out.println("Tipo de dado inválido! Somente numéricos do tipo inteiro.");
			System.out.println("Tente novamente...");
		}
		
		
		/*
		 * // TEST
		 * 
		 * System.out.println("Os número digitados são:"+primeiroNumero+" e "
		 * +segundoNumero);
		 */
	}
}