package listaDeExercicioGenericos;

public class ProdutoGenerico2<T, U> {

		private T codigo;
		private String descricao;
		private U preco;
		
		
		public ProdutoGenerico2(T cod, String descr, U pr){
			codigo = cod;
			descricao = descr;
			preco = pr;
		}
		
		public T getCodigo() {return codigo;}
		public void setCodigo(T codigo){this.codigo = codigo;}
		
		public String getDescricao() {return descricao;}
		public void setDescricao(String descricao){this.descricao = descricao; }
		
		public U getPreco() { return preco; }
		public void sePreco(U preco) { this.preco = preco; }
		
		@Override
		public String toString(){
			return "ProdugoG{ " + "Codigo=" + codigo + ", descricao=" + descricao  + ", preço=" + preco + "}";
		}
}
