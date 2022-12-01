package uninter;

public abstract class Moeda {
	protected double valor; //protected pois as classes filhas não conseguiriam acessar esse valor;
	
	public abstract void info();	
	public abstract double converter();
}
