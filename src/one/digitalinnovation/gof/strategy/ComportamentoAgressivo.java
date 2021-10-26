/*****Pratica de projeto Patterns DIO por Hugo Porto*****/
package one.digitalinnovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}

	@Override
	public void descancar() {
		System.out.println("Cansei Mano Véi...");
		
		
	}

}
