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
			
			// Executa teste se os parâmetros são iguais
			
			if(primeiroNumero == segundoNumero) {
				System.out.println("Parâmetros iguais!");
				System.out.println("Tente novamente...");
			}
			
			// Calcula a difença entre os números digitados pelo usuário e imprime
			// a quantidade de vezes que corresponde a diferença
			
			int diferenca = segundoNumero - primeiroNumero;
			
			for(int x = 1; x <= diferenca; x++) {
				System.out.println("Imprimindo o número "+x);
			}
			
		} catch (ParametrosInvalidosException parametrosInvalidos) {
			parametrosInvalidos.dispararErro();
		} catch (InputMismatchException e) {
			System.out.println("Tipo de dado inválido! Somente numéricos do tipo inteiro.");
			System.out.println("Tente novamente...");
		} finally {
			System.out.println("Programa encerrado!");
		}
		
	}
}