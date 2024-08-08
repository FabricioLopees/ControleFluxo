package edu.fabricio.app;

class ParametrosInvalidosException extends Exception{
	static void dispararErro() {
		System.out.println("Parâmetros inválidos! O segundo parâmetro deve ser maior que o primeiro.");
		System.out.println("Tente novamente...");
	}
}