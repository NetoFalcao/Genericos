package listaDeExercicioGenericos;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class testeDicionario {

	
	@Test
	public void testeDicinoario(){
		Dicionario dicionario1 = new Dicionario();
		
		dicionario1.add("MCPG5684", "Tipo generico de carro");
		
		System.out.println(dicionario1.getValor("MCPG5684"));
	}
}
