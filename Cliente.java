
public class Cliente {

	
	private IClasseExistente classeExistente;
	
	public Cliente(IClasseExistente c){
		classeExistente = c;
	}
	
	void operacao(){
		classeExistente.metodoEsperado();
	}
}
