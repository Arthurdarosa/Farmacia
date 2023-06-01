import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class Produto {
	
	protected String nome;
	protected int estoque;
	protected double valor;
	
	public void venda(Cliente c, int qtd) {
		if(qtd<=estoque) {
		estoque = getEstoque()-qtd;
		c.setSaldo(c.getSaldo() + (qtd*valor));
	
		}
	}
	
}
