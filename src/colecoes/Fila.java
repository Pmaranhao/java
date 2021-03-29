package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Pedro");//retorna false
		fila.offer("Paulo");// lan�a uma exce��o
		fila.add("Raphael");
		fila.add("�nio");
		
		//diferen�a quando a fila est� vazia...
		System.out.println(fila.peek());// peek(retorna null)
		System.out.println(fila.element());// lan�a uma exce��o
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); 
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		
	}
}
