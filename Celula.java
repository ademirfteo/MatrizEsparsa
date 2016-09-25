
public class Celula<T> {

	private T conteudo;
	private Celula<T> previous;
	private Celula<T> next;

	public Celula(T conteudo) {
		this.conteudo = conteudo;
	}

	public void setPrevious(Celula<T> cel) {
		this.previous = cel;
	}

	public void setNext(Celula<T> cel) {
		this.next = cel;
	}

	public T getValue() {
		return conteudo;
	}

	public Celula<T> getNext() {
		return next;
	}

	public Celula<T> getPrevious() {
		return previous;
	}
}
