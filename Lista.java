import java.util.Iterator;
import java.util.function.Consumer;

public class Lista<T> implements java.lang.Iterable<T> {

	private Celula<T> head = null;
	private Celula<T> tail = null;
	private String nome;
	
	public Lista(String nome) {
		this.nome = nome;
	}

	private class ListaIterador implements Iterador<T> {
		
		private Celula<T> atual;

		public ListaIterador() {
			atual = null;
		}

		@Override
		public boolean hasNext() {
			if (atual == null) {				
				return head != null;
			}	
			return atual.getNext() != null;
		}

		@Override
		public T next() {
			if (atual == null) {
				atual = head;
			} else {
				atual = atual.getNext();
			}
			return atual.getValue();
		}

		@Override
		public void append(T conteudo) {
			if (atual == null) {
				throw new IllegalStateException("Use next() before.");
			}	
			Celula<T> e = new Celula<T>(conteudo);
			Celula<T> proximo = atual.getNext();
			e.setNext(proximo);
			e.setPrevious(atual);
			atual.setNext(e);

			if (proximo == null) {
				tail = e;
			} else {					
				proximo.setPrevious(e);
			}
		}

		@Override
		public void insert(T conteudo) {
			
			Celula<T> e = new Celula<T>(conteudo);
			Celula<T> anterior = atual.getPrevious();
			e.setPrevious(anterior);
			e.setNext(atual);
			atual.setPrevious(e);

			if (anterior == null) {
				head = e;
			} else {
				anterior.setNext(e);
			}
		}
	}

	public void append(T conteudo) {
		
		Celula<T> e = new Celula<T>(conteudo);

		if (tail == null) {
			head = e;
		} else {
			e.setPrevious(tail);
			tail.setNext(e);
		}
		tail = e;
	}

	@Override
	public Iterator<T> iterator() {
		return new ListaIterador();
	}

	public void addFirst(T conteudo) {
		
		Celula<T> e = new Celula<>(conteudo);

		if (head==null) {
			tail = e;
		} else {
			e.setNext(head);
			head.setPrevious(e);
		}
		head = e;
	}

	public T getLast() {
		
		if (tail == null) {
			return null;
		}
		return tail.getValue();
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void removeLast() {
		if (tail == null) {
			return;
		}
		if (head == tail) {
			head=tail=null;
		} else {
			Celula<T> anterior = tail.getPrevious();
			tail = anterior;
			tail.setNext(null);
		}
	}
	
	public String toString() {
		return nome;
	}
}
