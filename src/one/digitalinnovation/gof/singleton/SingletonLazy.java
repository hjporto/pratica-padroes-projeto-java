/*****Pratica de projeto Patterns DIO por Hugo Porto*****/
package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author falvojr
 */
public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
