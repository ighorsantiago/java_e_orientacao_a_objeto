import java.util.Scanner;

public class Entrada {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		String nome = s.nextLine();
		System.out.println("Olá " + nome);
	}
}