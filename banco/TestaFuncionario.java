public class TestaFuncionario {

	public static void main(String[] args) {
	
		Funcionario[] empregados = new Funcionario[5];
		
		for(int i = 0; i < empregados.length;i++) {
			
			empregados[i] = new Funcionario();		
		}
		
		empregados[0].nome = "Ighor";
		empregados[0].rg = "0.0.0-0";
		empregados[0].departamento = "TI";
		empregados[0].salario = 1800.0;
		empregados[0].dataDeEntrada.dia = 20;
		empregados[0].dataDeEntrada.mes = 02;
		empregados[0].dataDeEntrada.ano = 2016;
				
		empregados[1].nome = "Lucas";
		empregados[1].rg = "0.0.0-0";
		empregados[1].departamento = "BI";
		empregados[1].salario = 3000.0;
		empregados[1].dataDeEntrada.dia = 19;
		empregados[1].dataDeEntrada.mes = 12;
		empregados[1].dataDeEntrada.ano = 2015;

		empregados[3].nome = "Vitor";
		empregados[3].rg = "0.0.0-0";
		empregados[3].departamento = "Vendas";
		empregados[3].salario = 2400.0;
		empregados[3].dataDeEntrada.dia = 05;
		empregados[3].dataDeEntrada.mes = 03;
		empregados[3].dataDeEntrada.ano = 2016;

//		funcionario4.nome = "Diogo";
//		funcionario4.salario = 2400.0;

//		funcionario1.recebeAumento(200.0);
		
//		empregados[0].mostra();
//		empregados[1].mostra();
//		empregados[3].mostra();


		for(int i = 0; i < empregados.length; i++) {
			if(empregados[i].nome != null) {
				System.out.println(empregados[i]);
			}
		}
		
		/*
		if(funcionario4 == funcionario5) {
			System.out.println("Iguais...");
		}
		else {
			System.out.println("Diferentes...");
		}*/
	}
}
