package controller;
import java.util.Scanner;


public class Expressao {
	
	private String exprPosFixa = "";
	private String topo;
	
	public Expressao() {}
	
	private int Priority(String sinal) {
		
		switch(sinal) {
			case "+":
			case "-":	
				return 1;
			case "*":
			case "/":
				return 2;
			case "^":
				return 3;
			default:
				return 0;
		}
	}
	
	public boolean Operador (String op)  {
		return(op.equals("(") || op.equals(")") || op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"));
	}
	
	public String Converte(String exprInfixa) {
		
		Pilha<String> pilha = new Pilha<>();

		String[] formula = exprInfixa.split(" ");
		for(String token : formula) {
			
			if (!Operador(token)) {
				this.exprPosFixa = this.exprPosFixa+" "+token;
				
			} else {
				if (token.equals(")")) {
					while (!pilha.Peek().equals("(")) {
						this.exprPosFixa = this.exprPosFixa+" "+pilha.Pop();
					}				
				}
				
				if (pilha.IsEmpty() || pilha.Peek().equals("(") || Priority(token) > Priority(pilha.Peek())) {
					pilha.Push(token);
				}
			}
		}

		while (!pilha.IsEmpty() ) {			
			topo = pilha.Pop();
			if (!topo.equals("(") && !topo.equals(")")) {
				this.exprPosFixa = this.exprPosFixa+" " +topo;
			}
		}
		
		return this.exprPosFixa;
	}
	
	public Double Calcula(String exprPosFixa) {
		
		Pilha<Double> pilha = new Pilha<>();
		
		String[] formula = exprPosFixa.split(" ");
		
		for(String token : formula) {
			
			if (Operador(token)) {
				
				Double	rhs = pilha.Pop();
				Double	lhs = pilha.Pop();
				
				switch(token){
					case "+":
						pilha.Push(lhs + rhs);
						break;
					case "-":
						pilha.Push(lhs - rhs);
						break;
					case "/":
						pilha.Push(lhs / rhs);
						break;
					case "*":
						pilha.Push(lhs * rhs);
						break;
				}
			}
			else if (!Operador(token) && !token.equals("")) {				
				pilha.Push(Double.parseDouble(token));
			}
		}		
		return pilha.Pop();
	}
}
