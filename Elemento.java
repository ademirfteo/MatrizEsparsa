
public class Elemento<T> {

	private T valor;
	private Elemento<T> previous;
	private Elemento<T> next;

	public Elemento(T valor) {
		this.valor = valor;
	}

	public void setPrevious(Elemento<T> elem) {
		this.previous = elem;
	}

	public void setNext(Elemento<T> elem) {
		this.next = elem;
	}

	public T getValue() {
		return valor;
	}

	public Elemento<T> getNext() {
		return next;
	}

	public Elemento<T> getPrevious() {
		return previous;
	}
}
