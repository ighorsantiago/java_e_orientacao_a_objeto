public class Data {

	private int dia; 
	private int mes;
	private int ano;
	private String data;

	public Data(int dia,int mes,int ano) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {

		return this.dia;
	}

	public void setDia(int dia) {

		this.dia = dia;
	}

	public int getMes() {

		return this.mes;
	}

	public void setMes(int mes) {

		this.mes = mes;
	}

	public int getAno() {

		return this.ano;
	}

	public void setAno(int ano) {

		this.ano = ano;
	}

	data = dia + "/" + "/" + ano;

	public String getData() {

		return data;
	}

	public void setData(dia, mes, ano) {

		this.data = data;
	}
}
