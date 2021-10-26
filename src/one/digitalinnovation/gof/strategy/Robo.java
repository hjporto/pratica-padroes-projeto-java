/*****Pratica de projeto Patterns DIO por Hugo Porto*****/
package one.digitalinnovation.gof.strategy;

public class Robo {
	
	private Comportamento comportamento;

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
	public void descancar() {
		comportamento.descancar();
	}
}
