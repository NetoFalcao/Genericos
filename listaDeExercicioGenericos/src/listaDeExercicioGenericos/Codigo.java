package listaDeExercicioGenericos;


public class Codigo {

	
	private Object valor1;
	private Object valor2;
	
	
	public Codigo(Object valor1, Object valor2){
		this.valor1 = valor1;
		this.valor2 = valor2;
	}


	public Object getValor1() {
		return valor1;
	}


	public void setValor1(Object valor1) {
		this.valor1 = valor1;
	}


	public Object getValor2() {
		return valor2;
	}


	public void setValor2(Object valor2) {
		this.valor2 = valor2;
	}
	
	@Override
	public String toString(){
		return (String)this.valor1+this.valor2;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Codigo other = (Codigo) obj;
		if (valor1 == null) {
			if (other.valor1 != null)
				return false;
		} else if (!valor1.equals(other.valor1))
			return false;
		if (valor2 == null) {
			if (other.valor2 != null)
				return false;
		} else if (!valor2.equals(other.valor2))
			return false;
		return true;
	}
	
	
	
	
}
