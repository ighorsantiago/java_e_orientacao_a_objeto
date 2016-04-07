import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
		
		String nome;
		float peso, altura, imc;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		nome = s.nextLine();
		System.out.println("Ola, " + nome + " vamos calcular o seu IMC...");
		System.out.println(nome + ", digite seu peso... \nExemplo: 90.7");
		peso = Float.parseFloat(s.nextLine());
		System.out.println(nome + ", digite sua altura... \nExemplo: 1.80");
		altura = Float.parseFloat(s.nextLine());
		
		imc = peso / (altura * altura);
		
		System.out.println("O seu IMC é: " + imc);
	}
}