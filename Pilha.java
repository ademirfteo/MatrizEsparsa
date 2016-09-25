import java.util.Scanner;

public class Pilha<T> {
	
	private Lista<T> lista = new Lista<>("pilha");
	
	public void Push (T valor){		
		lista.append(valor);
	}
	
	public T Peek (){
		return lista.getLast();
	}
	
	public boolean IsEmpty(){
		return lista.isEmpty();
	}
	
	public T Pop (){
		T valor = Peek();
		lista.removeLast();
		return valor;
	}
}
