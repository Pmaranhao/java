package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Bruno"));
		usuarios.add(new Usuario("Vitor"));
		
		boolean resultado = usuarios.contains(new Usuario("Pedro"));
		System.out.println(resultado);
		
	}
	
}
