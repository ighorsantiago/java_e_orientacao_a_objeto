public class Funcionario {

	private String nome;
	private String departamento;
	private double salario;
	Data dataDeEntrada = new Data(dia, mes, ano);
	private String rg;

	public double getSalario() {

		return this.salario;
	}

	public void setSalario(double salario) {

		this.salario = salario;
	}

	public String getNome() {

		return this.nome;
	}

	public void setNome(String nome) {

		this.nome = nome;
	}

	public String getDepartamento() {

		return this.departamento;
	}

	public void setDepartamento(String departamento) {

		this.departamento = departamento;
	}

	public String getRg() {

		return this.rg;
	}

	public void setRg(String rg) {

		this.rg = rg;
	}

	void recebeAumento(double valor) {
		
		this.salario += valor;
	}
	
	double calculaGanhoAnual() {
		
		return this.salario * 12;
	}

	void mostra() {

		System.out.println(
			"Nome: " 			+ this.nome 					+ "\n" + 
			"RG: " 				+ this.rg			 			+ "\n" + 
			"Departamento: " 	+ this.departamento				+ "\n" + 
			"Salario: " 		+ this.salario	 				+ "\n" +
			"Data de entrada: " + this.dataDeEntrada.getDia()	//+ "/"
//								+ this.dataDeEntrada.getMes()	+ "/"
//								+ this.dataDeEntrada.getAno()	+ "\n"
		);
		
		System.out.println("Ganho Anual do " + this.nome + ": " + this.calculaGanhoAnual() + "\n");
	}
}
