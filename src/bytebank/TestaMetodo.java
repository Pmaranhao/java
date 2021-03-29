package bytebank;

public class TestaMetodo {
	 public static void main(String[] args) {
		Conta contaDoPedro = new Conta(372, 198764);
		
		contaDoPedro.saldo = 300;
		System.out.println(contaDoPedro.saldo);
		contaDoPedro.deposita(300);
		System.out.println(contaDoPedro.saldo);
		
		boolean conseguiuSacar = contaDoPedro.saca(590);
		System.out.println(contaDoPedro.saldo);
		System.out.println("Sacou: " + conseguiuSacar);
	 
		Conta contaDaFernanda = new Conta(372, 198468);
		contaDaFernanda.deposita(1000);
		
		contaDaFernanda.transfere(300, contaDoPedro);
		
		System.out.println("Saldo Pedro: R$ " + contaDoPedro.saldo + 
				"\nSaldo Fernanda: R$ " + contaDaFernanda.saldo);
	 
	 }
	 
}
