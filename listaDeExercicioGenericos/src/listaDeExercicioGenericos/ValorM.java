package listaDeExercicioGenericos;

public class ValorM {

	private double valor;
	
	
	public ValorM(double valorM){
		this.valor = valorM;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString(){
		return this.valor + "";
	}
	
}
