package Delegation;

public class Account {
	private double valor;
	
	public double getBalance() {
		return valor;
	}
	public double getBalance(Conversion conversion) {
		return conversion.convert(valor);
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
