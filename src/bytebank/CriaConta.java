package bytebank;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta(448, 12785);
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta(448, 12786);
		
		segundaConta.saldo = 50;
		
		
		System.out.println("Primeira conta = R$" + primeiraConta.saldo);
		System.out.println("Segunda conta = R$" + segundaConta.saldo);
		
		Conta dependenteDaPrimeiraConta = new Conta(448, 12785);
		dependenteDaPrimeiraConta = primeiraConta;
		
		dependenteDaPrimeiraConta.saldo += 200;
		
		System.out.println("Conta da esposa conjunta, saldo de R$ " + dependenteDaPrimeiraConta.saldo);

	}
			
}
