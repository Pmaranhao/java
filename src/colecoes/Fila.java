package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//diferença é o comportamento quando a fila está cheia!
		fila.add("Pedro");//retorna false
		fila.offer("Paulo");// lança uma exceção
		fila.add("Raphael");
		fila.add("Ênio");
		
		//diferença quando a fila está vazia...
		System.out.println(fila.peek());// peek(retorna null)
		System.out.println(fila.element());// lança uma exceção
		
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
