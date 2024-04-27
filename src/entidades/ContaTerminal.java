package entidades;

public class ContaTerminal {

	private Integer numero;
	private String agencia;
	private String nomeCliente;
	private Double saldo;

	public ContaTerminal() {
	}

	public ContaTerminal(Integer numero, String agencia, String nomeCliente, Double saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Olá " + nomeCliente).append(", obrigado por criar uma conta em nosso banco.\n");
		sb.append("Sua agência é " + agencia).append(", conta " + numero);
		sb.append(" e seu saldo R$" + String.format("%.2f", saldo)).append(" já está disponível para saque.");
		return sb.toString();
	}
}
