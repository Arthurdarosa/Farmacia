import lombok.Getter;

@Getter
public class Medicamentos extends Produto {
	private boolean receita;

	public Medicamentos(String nome, int estoque, double valor, boolean receita) {
		super(nome, estoque, valor);
		this.receita = receita;
	}

	@Override
	public void venda(Cliente c, int qtd) {
		if(receita==true) {
			if(c.getNomeMedico()!=null) {
				if(qtd<=estoque) {
				estoque = getEstoque()-qtd;
				c.setSaldo(c.getSaldo() + (qtd*valor));
				}
			}
		}else {
			if(qtd<=estoque) {
				estoque = getEstoque()-qtd;
				c.setSaldo(c.getSaldo() + (qtd*valor));
			
				}
		}
	}
}
