package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Pedro");
		usuarios.put(3, "Fred");
		usuarios.put(4, "Alex");
		usuarios.put(5, "Marcelo");
		usuarios.put(1, "Cristiano");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Pedro"));
		
		System.out.println(usuarios.get(5));
		
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}

		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + "====>");
			System.out.println(registro.getValue());
		}
		
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(2, "Carlos"));
	}
	
}
