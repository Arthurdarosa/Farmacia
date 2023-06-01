
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FarmaciaTest {
	private Farmacia farmacia = new Farmacia();
	
	@BeforeEach
	public void init() {
		farmacia.p.clear();
		
		farmacia.addProduto(new Medicamentos("buscopan", 10, 15, false));
		farmacia.addProduto(new Equipamentos("ciringa", 0, 25));
		farmacia.addProduto(new Perfumes("kaiak", 20, 200));
	}
	
	@Test
	public void test1() {
		farmacia.addProduto(new Perfumes("portiolli", 30, 300));
		Produto p = farmacia.p.get(3);
		assertEquals(30, p.getEstoque());
		assertEquals(300, p.getValor());
		assertEquals("portiolli", p.getNome());
	}
	
	@Test
	public void test2() {
		Produto p = farmacia.p.get(3);
		Cliente cliente = new Cliente() ;
		cliente.
		farmacia.compra(p, cliente, 2);
//		Conta cor = caixa.getContar().get(0);
//		ContaUniversitaria uni = (ContaUniversitaria)caixa.getContar().get(2);
//		caixa.transferencia(10, cor, uni);
//		assertEquals(0, cor.getSaldo());
//		assertEquals(20, uni.getSaldo());
	}
}
