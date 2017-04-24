package listaDeExercicioGenericos;

public class Codigo2<T,U> {
	
	private T codigo1;
	private U codigo2;
	
	
	public Codigo2(T codigo1, U codigo2){
		this.codigo1 = codigo1;
		this.codigo2 = codigo2;
	}
	
	public Codigo2<T,U> getCodigo(){
		return new Codigo2<T,U>(this.codigo1, this.codigo2);
	}
	
	public void setCodigo(T codigo1, U codigo2){
		this.codigo1 = codigo1;
		this.codigo2 = codigo2;
	}
	
	@Override
	public String toString(){
		return this.codigo1 + "" + this.codigo2;
	}

}
