import java.util.ArrayList;
import java.util.List;



public class Farmacia{
	List<Produto> p = new ArrayList<Produto>();
	
	public void addProduto(Produto c) {
		p.add(c);
	}
	
	public void compra(Produto p, Cliente c, int qtd) {
		p.venda(c, qtd);
	}
	
	public void pagamento(Cliente c, double valor) {
		c.setSaldo(c.getSaldo()-valor);
	}
}
