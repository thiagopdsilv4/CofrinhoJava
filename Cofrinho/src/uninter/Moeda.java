package uninter;

public abstract class Moeda {
	protected double valor; //protected pois as classes filhas n�o conseguiriam acessar esse valor;
	
	public abstract void info();	
	public abstract double converter();
}
