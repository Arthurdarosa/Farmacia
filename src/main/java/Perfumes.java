
public class Perfumes extends Produto{
	public Perfumes(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}
	
	@Override
	public void venda(Cliente c, int qtd) {
		if(c.getSaldo()<=300) {
			if(qtd<=estoque) {
				estoque = getEstoque()-qtd;
				c.setSaldo(c.getSaldo() + (qtd*valor));
			
				}
		}
		
	}
	
}
