public class Empresa {

	String nome;
	String cnpj;
	Funcionario[] empregados;

	void adicionaFuncionario(Funcionario f){
		for(int i = 0; i < empregados.length; i++) {
			if(empregados[i] == null) {
				this.empregados[i] = f;
			}
		}	
	}
	
	void mostraEmpregados() {
		
		for(int i = 0; i < this.empregados.length; i++) {
			
			System.out.println(empregados);
		}
	}
}