package controller;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {		
				
		/* MATRIZ 
		
		String celula;
		Matriz m = new Matriz();
		
		m.InsertDados();
		
	//	celula = "A8";
	//	m.CreateCel(celula, "0");
		
	//	celula = "A7";
	//	m.CreateCel(celula, "0");
		
	//	celula = "A1";
	//	m.CreateCel(celula, "0");
		
	//	celula = "A1";
	//	m.CreateCel(celula, "1");
		
	//	celula = "A8";
	//	m.CreateCel(celula, "8");
		
		m.ShowMatriz();
		*/
		
		/*
		if (m.CelExists(celula) == true) {
			System.out.println("célula já existe");
		} else {
			m.CreateCel(celula, 0);
			System.out.println("célula criada");
		}
		
		if (m.CelExists(celula) == true) {
			System.out.println("célula já existe");
		} else {
			m.CreateCel(celula, 0);
			System.out.println("célula criada");
		}
		*/
		
		/* TESTE ITERADOR  
		
		Lista<Lista> coluna = new Lista<>("teste");
		Lista<Objeto> A = new Lista<>("A");
		coluna.append(A);
		Lista<Objeto> B = new Lista<>("B");
		coluna.append(B);
		Lista<Objeto> C = new Lista<>("C");
		coluna.append(C);
		Lista<Objeto> D = new Lista<>("D");		
		coluna.append(D);
		
		Lista<Objeto> H = new Lista<>("H");
		coluna.append(H);
		Lista<Objeto> I = new Lista<>("I");
		coluna.append(I);
				
		Iterador<Lista> iter;
		iter = (Iterador<Lista>) coluna.iterator();
		
		Lista<Objeto> E = new Lista<>("E");		
		for (Lista i : coluna) {
			System.out.println("comparou: "+i);
			int x = i.toString().compareTo("E");
			if (x < 0) {
				iter.next();			
				System.out.println("menor");
			} else {		
				iter.append(E);
				System.out.println("maior");
				break;
			}
		}
		
		System.out.println("------------------\n");
		
		iter = (Iterador<Lista>) coluna.iterator();
		Lista<Objeto> F = new Lista<>("F");		
		for (Lista i : coluna) {
			System.out.println("comparou: "+i);
			int x = i.toString().compareTo("F");
			if (x < 0) {
				iter.next();			
				System.out.println("menor");
			} else {		
				iter.append(F);
				System.out.println("maior");
				break;
			}
		}
				
		for (Lista i : coluna) {
			System.out.println(i);			
		}
		*/
		
		/* LISTA 

		Lista<Integer> lista = new Lista<>("teste");
		lista.append(1);
		lista.append(2);
		lista.append(3);
		
		for (Integer i : lista) {
			System.out.println(i);
		}		
		System.out.println(" =============== ");
		
	//	Iterador<Integer> iter;
	//	iter = (Iterador<Integer>) lista.iterator();
	//	iter.next();
	//	iter.insert(-50);
	//	iter.append(50);
		
		for (Integer i : lista) {
			System.out.println(i);
		}		
		System.out.println(" =============== ");
		
	//	lista.addFirst(0);
	//	for (Integer i : lista) {
	//		System.out.println(i);
	//	}
		
		*/
		
		/* PILHA 
		
		Matriz m = new Matriz();
		String celula = "M12";
		m.CreateCel(celula, "( 2 * 4 ) + 6");
		
	//	m.ErasesValue("M12");
		
		String formula = m.ShowFormula("M12");
		System.out.println(formula);
		
	//	String formula = "( M12 + 16 ) * 3";
		
	//	formula = m.ShowResult(formula);
	//	System.out.println(formula);
		
		//formula = m.CalcReference(formula);	
		//System.out.println(formula);
		
		//Expressao c = new Expressao();
		//formula = c.Converte(formula);
		//System.out.println(formula);
		
		//Double resultado = c.Calcula(formula);
		//System.out.println(resultado);

		*/
	}
}
