public class TestaFuncionario {

	public static void main(String[] args) {
	
		Funcionario[] empregados = new Funcionario[5];
		
		for(int i = 0; i < empregados.length;i++) {
			
			empregados[i] = new Funcionario();		
		}
		
		empregados[0].setNome("Ighor");
		empregados[0].setRg("0.0.0-0");
		empregados[0].setDepartamento("TI");
		empregados[0].setSalario(1800.0);
		empregados[0].setDia(20);
		empregados[0].setMes(02);
		empregados[0].setAno(2016);
				
		empregados[1].setNome("Lucas");
		empregados[1].setRg("0.0.0-0");
		empregados[1].setDepartamento("BI");
		empregados[1].setSalario(3000.0);
		empregados[1].setDia(19);
		empregados[1].setMes(12);
		empregados[1].setAno(2015);

		empregados[3].setNome("Vitor");
		empregados[3].setRg("0.0.0-0");
		empregados[3].setDepartamento("Vendas");
		empregados[3].setSalario(2400.0);
		empregados[3].setDia(05);
		empregados[3].setMes(03);
		empregados[3].setAno(2016);

//		funcionario4.nome = "Diogo";
//		funcionario4.salario = 2400.0;

//		funcionario1.recebeAumento(200.0);
		
//		empregados[0].mostra();
//		empregados[1].mostra();
//		empregados[3].mostra();


		for(int i = 0; i < empregados.length; i++) {
			if(empregados[i].getNome() != null) {
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
