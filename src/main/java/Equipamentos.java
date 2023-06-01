
public class Equipamentos extends Produto{
	public Equipamentos(String nome, int estoque, double valor) {
		super(nome, estoque, valor);
	}
	
	@Override
	public void venda(Cliente c, int qtd) {
		c.setSaldo(c.getSaldo() + (qtd*valor));
	}
}
