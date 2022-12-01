package uninter;

public class Dolar extends Moeda{
	
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}

	@Override
	public void info() {
		System.out.println("Dolar - " + valor);		
	}

	@Override
	public double converter() {
		return this.valor * 5.3;		
	}
	
	@Override
	public boolean equals(Object objeto) {//Object da classe objeto e objeto é o objeto
		if(this.getClass() != objeto.getClass()) {//se o getClass é diferente do objeto que foi passado como argumento,retornar falso 
			return false;
		}
		
		//downcasting para não dar erro
		
		Dolar objetoDeDolar = (Dolar)objeto;//casting
		
		if(this.valor != objetoDeDolar.valor) {
			return false;
		}
		
		return true;
	}

}
