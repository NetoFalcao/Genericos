package listaDeExercicioGenericos;

import org.junit.Test;

public class testeCodigoEProduto {

	@Test
	public void testeCodigoEProdutos(){
		Codigo codigo = new Codigo("FDC", 756);
		ProdutoGenerico prod = new ProdutoGenerico(codigo, "produto teste", 666);
		
		
		System.out.println(prod.getCodigo());
		System.out.println(prod.getDescricao());
		System.out.println(prod.getPreco());
		System.out.println(prod.toString());
		
		Codigo codigo2 = new Codigo("FDC", 756);
		ProdutoGenerico prod2 = new ProdutoGenerico(codigo, "produto teste", 666);
		
		System.out.println(codigo.equals(codigo2));
		
		Codigo2 codigo3 = new Codigo2(564, 555);
		ProdutoGenerico prod3 = new ProdutoGenerico(codigo3, "produto teste2", 666);
		
		ProdutoGenerico2 prod90 = new ProdutoGenerico2(codigo3, "produtoteste", 666);
		System.out.println(prod90.toString());
		
	}
	
}
