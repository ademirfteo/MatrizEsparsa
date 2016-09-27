package controller;

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
	private String expressao;
	private Double resultado;
	
	public Matriz() {
		coluna = new Lista<>("matriz");		
	}
	
	public void CreateCel(String nome, String formula) {
		
		if (coluna.isEmpty()) {
			AddColCel(nome, formula);
		} else {
			Contem(nome);			
			if (contemCol == false && contemCel == false) {
				AddColCel(nome, formula);
			}			
			else if (contemCol == true && contemCel == false) {			
				AddCelula(celula, nome, formula);
			}
			else if (contemCol == true && contemCel == true) {
				AlterCel(celula, nome, formula);			
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
	
	public void AddColCel(String nome, String formula) {
		
		o = new Objeto();
		o.setNome(nome);
		o.setFormula(formula);
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
						iter.next();
						iter.insert(celula);
						break;
					}
				}
			}
		}
	}
	
	public void AddCelula(Lista Objetos, String nome, String formula) {
		
		celula = Objetos;
		
		o = new Objeto();
		o.setNome(nome);
		o.setFormula(formula);
		
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
						iterO.next();
						iterO.insert(o);
						break;
					}
				}
			}
		}
	}
	
	public void AlterCel(Lista Objetos, String nome, String formula) {		
		celula = Objetos;			
		for (Objeto i : celula) {
			int x = i.getNome().compareTo(nome);
			if (x == 0) {					
				i.setFormula(formula);
				break;
			}
		}	
	}
	
	public void RemoveCel(Lista Objetos, String nome, String formula) {
		celula = Objetos;
		cel = celula.getLast().getNome();
		int x = cel.compareTo(nome);
		if (x == 0) {
			//unica
		} else {
			//mais de uma
		}
		
	}
	
	public String ShowFormula(String nome) {
		String formula = "";
		for (Lista i : coluna) {
			col = i.toString();
			if (col.equals(OnlyLetter(nome))) {
				celula = i;
				for (Objeto j : celula) {
					if (j.getNome().equals(nome)) {	
						formula = j.getFormula();						
						break;
					}
				}
			}
		}
		return formula;
	}
	
	public String ShowResult(String formula) {		
		try {
			Expressao c = new Expressao();
			try {
				expressao = c.Converte(formula);
				System.out.println(expressao);
			} catch (IllegalArgumentException e) {
				expressao = "";
				throw new FormulaException();				
			}
			
			try {
				resultado = c.Calcula(expressao);
				System.out.println(resultado);
			} catch (IllegalArgumentException e) {
				resultado = 0.0;
				throw new ResultException();
			}			
		} finally {
			if (resultado == null) {
				return "";
			} else {
				return String.valueOf(resultado);
			}			
		}
	}
	
	public void ShowMatriz() {
		for (Lista i : coluna) {
			System.out.println("\ncoluna: "+i.toString());
			celula = i;
			for (Objeto j : celula) {
				System.out.println("Célula: "+j.getNome()+" | Valor: "+j.getFormula());
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
	
	public class FormulaException extends Exception {
		@Override
		public String getMessage(){
			return "Expressão inválida!";
		}
	}
	
	public class ResultException extends Exception {
		@Override
		public String getMessage(){
			return "Resultado inválido!";
		}
	}
}
