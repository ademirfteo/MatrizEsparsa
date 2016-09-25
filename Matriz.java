
public class Matriz {
	
	private Lista<Lista> coluna;
	private Lista<Objeto> celula;
	private Iterador<Lista> iter;
	private Iterador<Objeto> iterO;
	private Objeto o;
	private boolean contemCol;
	private boolean contemCel;
	private String col;
	private String cel;
	
	public Matriz() {
		coluna = new Lista<>("matriz");		
	}
	
	public void CreateCel(String nome, double valor) {
		
		if (coluna.isEmpty()) {
			AddColCel(nome, valor);
		} else {
			Contem(nome);
			//add coluna e célula
			if (contemCol == false && contemCel == false) {
				AddColCel(nome, valor);
			}
			//add célula
			else if (contemCol == true && contemCel == false) {			
				AddCelula(celula, nome, valor);
			}	
		}	
	}
	
	public void Contem(String nome) {
		contemCol = false;
		contemCel = false;
		for (Lista i : coluna) {
			col = i.toString();
			if (col.equals(OnlyLetter(nome))) {
				contemCol = true;
				celula = i;
				contemCel = false;
				for (Objeto j : celula) {
					if (j.getNome().equals(nome)) {						
						contemCel = true;
						break;
					}
				}
			}
		}
	}
	
	public void AddColCel(String nome, double valor) {
		
		o = new Objeto();
		o.setNome(nome);
		o.setValor(valor);
		celula = new Lista<>(OnlyLetter(nome));
		celula.append(o);		
		
		if (coluna.isEmpty()) {
			coluna.append(celula);
		} else {		
			col = coluna.getLast().toString();			
			int x = col.compareTo(OnlyLetter(nome));
			if (x < 0) {
				coluna.append(celula);
			} else {
				iter = (Iterador<Lista>) coluna.iterator();
				for (Lista i : coluna) {
					x = i.toString().compareTo(OnlyLetter(nome));
					if (x < 0) {						
						iter.next();
					}
					else if (x > 0) {						
						iter.append(celula);
						break;
					}
				}
			}			
		}
	}
	
	public void AddCelula(Lista Objetos, String nome, double valor) {
		
		celula = Objetos;
		
		o = new Objeto();
		o.setNome(nome);
		o.setValor(valor);
		
		if (celula.isEmpty()) {
			celula.append(o);
		} else {
			cel = celula.getLast().getNome();			
			int x = cel.compareTo(nome);
			if (x < 0) {
				celula.append(o);
			} else {
				iterO = (Iterador<Objeto>) celula.iterator();			
				for (Objeto i : celula) {
					x = i.getNome().compareTo(nome);
					if (x < 0) {					
						iterO.next();
					}
					else if (x > 0) {						
						iterO.append(o);
						break;
					}
				}
			}
		}
	}
	
	public void RemoveCel(String nome) {
		//falta implementar
	}
	
	public void ShowMatriz() {
		for (Lista i : coluna) {
			System.out.println("\ncoluna: "+i.toString());
			celula = i;
			for (Objeto j : celula) {
				System.out.println(j.getNome());
			}
		}	
	}
	
	public String OnlyLetter(String nome) {
		if (nome != null) {
			return nome = nome.replaceAll(nome.replaceAll("[^0-9]*", ""), "");
		} else {
			return "";
		}
	}
	
	public String OnlyNumber(String nome) {
		if (nome != null) {
			return nome = nome.replaceAll("[^0-9]*", "");
		} else {
			return "";
		}
	}
}
