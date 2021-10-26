/*****Pratica de projeto Patterns DIO por Hugo Porto*****/
package one.digitalinnovation.gof.strategy;

public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}

	@Override
	public void descancar() {
		System.out.println("Parado e respirando...");
		
	}

}
