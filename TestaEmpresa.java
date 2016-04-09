public class TestaEmpresa {

	public static void main(String[] args) {
	
		Empresa empresa = new Empresa();
		
		for(int i = 0; i < empresa.empregados.length; i++) {
			
			Funcionario f = new Funcionario();
			f.salario = (1000 + (100 * i));
			
			empresa.adicionaFuncionario(f);
		}
		

		for(int j = 0; j < empresa.empregados.length; j++) {
			if(empresa.empregados[j].salario != 0.0) {
				System.out.println(empresa.empregados[j].salario);
			}
		}
	}
}
