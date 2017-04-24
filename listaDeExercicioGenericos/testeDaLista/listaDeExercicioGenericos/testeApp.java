package listaDeExercicioGenericos;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import org.junit.Test;

public class testeApp {

	
	@Test
	public void testeApp(){
	
		Map<Object, Object> mapUsado = new HashMap<Object, Object>();
		Object x = JOptionPane.showInputDialog("Valor1");
		Object y = JOptionPane.showInputDialog("Valor2");
		Par par = new Par(x, y);
		mapUsado.put(par.getValor1(), par.getValor2());
		
	}
	
}
