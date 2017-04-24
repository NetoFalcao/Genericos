package listaDeExercicioGenericos;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {

		
		
		Map<Object, Object> mapUsado = new HashMap<Object, Object>();
		for(int i=0; i < 2; i++){
			Object x = JOptionPane.showInputDialog("Valor1");
			Object y = JOptionPane.showInputDialog("Valor2");
			Par par = new Par(x, y);
			mapUsado.put(par.getValor1(), par.getValor2());
			
			System.out.println(mapUsado.get(x));
			System.out.println(mapUsado.size());
		}
		
		
		
	}

}
