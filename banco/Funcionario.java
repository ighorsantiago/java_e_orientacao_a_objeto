public class Funcionario {

	String nome;
	String departamento;
	double salario;
	Data dataDeEntrada = new Data();
	String rg;

	void recebeAumento(double valor) {
		
		this.salario += valor;
	}
	
	double calculaGanhoAnual() {
		
		return this.salario * 12;
	}

	void mostra() {

		System.out.println(
			"Nome: " 				+ this.nome 				+ "\n" + 
			"RG: " 					+ this.rg 					+ "\n" + 
			"Departamento: " 		+ this.departamento 		+ "\n" + 
			"Salario: " 			+ this.salario	 			+ "\n" +
			"Data de entrada: " 	+ this.dataDeEntrada.dia	+ "/" +
									  this.dataDeEntrada.mes	+ "/" +
									  this.dataDeEntrada.ano	+ "\n"
		);
		
		System.out.println("Ganho Anual do " + this.nome + ": " + this.calculaGanhoAnual() + "\n");
	}
}
