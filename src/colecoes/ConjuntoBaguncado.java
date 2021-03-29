package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(3);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove('x'));
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(3));
		
		Set numeros = new HashSet();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		
		System.out.println(numeros);
		System.out.println(conjunto);
		
		conjunto.addAll(numeros); //união entre dois conjuntos
		System.out.println(conjunto);
		
		conjunto.retainAll(numeros); 
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
