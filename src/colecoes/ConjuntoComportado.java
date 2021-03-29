package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>(); // em ordem 
		listaAprovados.add("Pedro");
		listaAprovados.add("Carlos");
		listaAprovados.add("Fernanda");
		listaAprovados.add("Priscila");
		listaAprovados.add("Demóstenes");
		listaAprovados.add("Rosane");
		listaAprovados.add("Raul");
		
		for (String candidato: listaAprovados) {
				System.out.println(candidato);
		}
		
		Set<Integer> numeros = new HashSet<>();
		numeros.add(1);
		numeros.add(13);
		numeros.add(7);
		numeros.add(9);
		numeros.add(10);
		numeros.add(2);
		
		for (Integer posicao: numeros) {
			System.out.println(posicao);
		}
		
	}

}
