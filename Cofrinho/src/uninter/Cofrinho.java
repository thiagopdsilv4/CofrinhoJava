package uninter;

import java.util.ArrayList;

public class Cofrinho { // classe abstrata � a classa m�e, classes filhas s�o classes que a classe m�e
						// tem

	private ArrayList<Moeda> listaMoedas;

	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}

	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}

	public boolean remover(Moeda moeda) {
		return this.listaMoedas.remove(moeda); //adicionado return pois foi retirado void
	}

	public void listagemMoedas() {

		if (this.listaMoedas.isEmpty()) {
			System.out.println("N�o existe nenhuma moeda no cofrinho!");
			return;// para parar o programa, como um "break;"
		}

		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() {

		if (this.listaMoedas.isEmpty()) {
			return 0;
		}

		double acumuladora = 0;

		for (Moeda moeda : this.listaMoedas) {
			acumuladora = acumuladora + moeda.converter();
		}
		
		return acumuladora;// retorna a variavel que acumulou o total convertido
	}
}
