import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Cliente {
	private String nome;
	private double saldo;
	private	String nomeMedico;
	
	public Cliente(String nome, String nomeMedico) {
		this.nome = nome;
		this.nomeMedico = nomeMedico;
		this.saldo = 0;
	}

}
