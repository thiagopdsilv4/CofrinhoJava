package uninter;

public class Real extends Moeda{
	
	public Real(double valorInicial) {
		this.valor = valorInicial;
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor;		
	}
	
	@Override
	public boolean equals(Object objeto) {//Object da classe objeto e objeto é o objeto
		if(this.getClass() != objeto.getClass()) {//se o getClass é diferente do objeto que foi passado como argumento,retornar falso 
			return false;
		}
		
		//downcasting para não dar erro
		
		Real objetoDeReal = (Real)objeto;//casting
		
		if(this.valor != objetoDeReal.valor) {
			return false;
		}
		
		return true;
	}

	
}
