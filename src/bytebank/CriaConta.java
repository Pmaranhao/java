package bytebank;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		
		segundaConta.saldo = 50;
		
		
		System.out.println("Primeira conta = R$" + primeiraConta.saldo);
		System.out.println("Segunda conta = R$" + segundaConta.saldo);
		
		Conta dependenteDaPrimeiraConta = new Conta();
		dependenteDaPrimeiraConta = primeiraConta;
		
		dependenteDaPrimeiraConta.saldo += 200;
		
		System.out.println("Conta da esposa conjunta, saldo de R$ " + dependenteDaPrimeiraConta.saldo);

	}
			
}
