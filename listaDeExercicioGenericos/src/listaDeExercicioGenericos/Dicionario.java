package listaDeExercicioGenericos;

import java.util.List;
import java.util.ArrayList;

public class Dicionario<T,U> {

	private List<T> lista1;
	private List<U> lista2;
	
	
	public Dicionario(){
		this.lista1 = new ArrayList<T>();
		this.lista2 = new ArrayList<U>();
	}
	
	public void add(T chave, U valor){
		lista1.add(chave);
		lista2.add(valor);
	}
	
	public U getValor(T key){
		for (int x = 0; x < lista1.size(); x++){
			if (key == lista1.get(x)){
				return lista2.get(x);
			}
		}
		return null;
	}
	
}
