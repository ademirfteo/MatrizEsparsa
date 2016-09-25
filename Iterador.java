
public interface Iterador<T> extends java.util.Iterator<T> {

	boolean hasNext();
	T next();
	void insert(T conteudo);
	void append(T conteudo);
}
