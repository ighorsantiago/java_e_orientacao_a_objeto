import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int numero1, numero2, resultado, operacao;
		
		System.out.println("Bem vindo a calculadora...\nEscolha uma operacao...\n1 - Soma \n2 - Subtracao \n3 - Multiplicacao \n4 - Divisao");
		operacao = Integer.parseInt(s.nextLine());
		
		System.out.println("Digite o primeiro numero");
		numero1 = Integer.parseInt(s.nextLine());
		
		System.out.println("Digite o segundo numero");
		numero2 = Integer.parseInt(s.nextLine());
		/*
		switch(operacao) {
			
			case 1:
				System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
				break;
			case 2:
				System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
				break;
			case 3:
				System.out.println(numero1 + " x " + numero2 + " = " + (numero1 * numero2));
				break;
			case 4:
				System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
				break;
			default:
				System.out.println("Comece de novo e preste atencao nas opcoes...");
		}*/
		
		if(operacao == 1) {
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
		}
		
		if(operacao == 2) {
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
		}
		
		if(operacao == 3) {
			System.out.println(numero1 + " x " + numero2 + " = " + (numero1 * numero2));
		}
		
		if(operacao == 4) {
			System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
		}
	}
}