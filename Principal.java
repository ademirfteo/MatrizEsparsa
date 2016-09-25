import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {		
				
		/* MATRIZ */ 
		
		String celula;
		Matriz m = new Matriz();
		
		celula = "A1";
		m.CreateCel(celula, 0);
		
		celula = "AA3";
		m.CreateCel(celula, 0);
		
		celula = "A3";
		m.CreateCel(celula, 0);
		
		celula = "B1";
		m.CreateCel(celula, 0);
		
		celula = "B3";
		m.CreateCel(celula, 0);
		
		celula = "B2";
		m.CreateCel(celula, 0);
		
		celula = "C1";
		m.CreateCel(celula, 0);
		
		celula = "C3";
		m.CreateCel(celula, 0);
		
		celula = "C2";
		m.CreateCel(celula, 0);
		
		celula = "G1";
		m.CreateCel(celula, 0);
		
		celula = "G3";
		m.CreateCel(celula, 0);
		
		celula = "G2";
		m.CreateCel(celula, 0);
		
		celula = "H1";
		m.CreateCel(celula, 0);
		
		celula = "H3";
		m.CreateCel(celula, 0);
		
		celula = "H2";
		m.CreateCel(celula, 0);
		
		celula = "Z1";
		m.CreateCel(celula, 0);
		
		celula = "Z3";
		m.CreateCel(celula, 0);
		
		celula = "Z2";
		m.CreateCel(celula, 0);
		
		celula = "E1";
		m.CreateCel(celula, 0);
		
		celula = "E3";
		m.CreateCel(celula, 0);
		
		celula = "E2";
		m.CreateCel(celula, 0);
		
		celula = "F1";
		m.CreateCel(celula, 0);
		
		celula = "F3";
		m.CreateCel(celula, 0);
		
		celula = "F3";
		m.CreateCel(celula, 0);
		
		celula = "P1";
		m.CreateCel(celula, 0);
		
		celula = "P3";
		m.CreateCel(celula, 0);
		
		celula = "P3";
		m.CreateCel(celula, 0);
		
		celula = "M1";
		m.CreateCel(celula, 0);
		
		celula = "M3";
		m.CreateCel(celula, 0);
		
		celula = "M3";
		m.CreateCel(celula, 0);
		
		m.ShowMatriz();
		
		
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
		
		Iterador<Integer> iter;
		iter = (Iterador<Integer>) lista.iterator();
		iter.next();
		iter.insert(-50);
		iter.append(50);		
		
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

		String expressao;
		Double resultado;
		Expressao c = new Expressao();
		
		expressao = c.Converte("( 1 + 2 ) * 3");
		System.out.println(expressao);

		resultado = c.Calcula(expressao);
		System.out.println(resultado);
		*/
	}
}
