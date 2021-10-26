/*****Pratica de projeto Patterns DIO por Hugo Porto*****/
package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Campinas";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
