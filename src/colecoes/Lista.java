package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Pedro"));
		lista.add(new Usuario("Guilherme"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Henrique"));
		lista.add(new Usuario("Laura"));
		
		System.out.println(lista.get(3).nome); //consegue acessar pelo índice. 
		
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(new Usuario("Laura")));
		
		System.out.println(lista.contains((new Usuario("Bete"))));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
