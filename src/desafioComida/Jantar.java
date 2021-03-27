package desafioComida;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida feijao = new Comida("Feijão" , 0.050);
		Comida arroz = new Comida("Arroz" , 0.150);
		Comida peixe = new Comida("Peixe" , 0.100);
		Comida batata = new Comida("batata" , 0.150);
		
		Pessoa pedro = new Pessoa("Pedro" , 72.200);
		
		System.out.println(pedro.peso);
		
		pedro.comer(feijao);
		System.out.println(pedro.peso);
		
		pedro.comer(peixe);
		System.out.println(pedro.peso);
	}	
		
}
