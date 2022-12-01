package uninter;

public class Euro extends Moeda{
	
	public Euro(double valorInicial) {
		this.valor = valorInicial;
	}

	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor * 5.58;		
	}
	
	@Override
	public boolean equals(Object objeto) {//Object da classe objeto e objeto � o objeto
		if(this.getClass() != objeto.getClass()) {//se o getClass � diferente do objeto que foi passado como argumento,retornar falso 
			return false;
		}
		
		//downcasting para n�o dar erro
		
		Euro objetoDeEuro = (Euro)objeto;//casting
		
		if(this.valor != objetoDeEuro.valor) {
			return false;
		}
		
		return true;
	}

	
}
