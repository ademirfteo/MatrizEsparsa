package controller;

public interface Iterador<T> extends java.util.Iterator<T> {

	boolean hasNext();
	T next();
	T previous();
	void insert(T conteudo);
	void append(T conteudo);
}
