package Delegation;

public class TesteMain {

	public static void main(String[] args) {
		Account account=new Account();
		account.setValor(5);
		System.out.println(account.getBalance(new ConversionDolar()));
		System.out.println(account.getBalance());

	}

}
