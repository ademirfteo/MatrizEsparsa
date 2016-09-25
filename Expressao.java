import java.util.Scanner;


public class Expressao {
	
	private String exprPosFixa = "";
	private char token;
	private char topo;
	
	public Expressao() {}
	
	private int Priority(Character sinal) {
		
		switch(sinal) {
		case '+':
		case '-':	
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return 0;
		}
	}
	
	private boolean Operador (char op)  {
		return(op == '(' || op == ')' || op == '+' || op == '-' || op == '*' || op == '/');
	}
	
	public String Converte(String exprInfixa) {
		
		Pilha<Character> pilha = new Pilha<>();
		
		Scanner scanner = new Scanner(exprInfixa);
		
		while(scanner.hasNext()) {
			
			token = scanner.next().charAt(0);
			
			if (!Operador(token)) {
				this.exprPosFixa = this.exprPosFixa +" "+token;
				
			} else {
				
				if (token == ')') {
					while (pilha.Peek() != '(') {
						this.exprPosFixa = this.exprPosFixa +" " +pilha.Pop();
					}				
				}
				
				if (pilha.IsEmpty() || pilha.Peek() == '(' || Priority(token) > Priority(pilha.Peek())) {
					pilha.Push(token);
				}
			}
		}

		while (!pilha.IsEmpty() ) {
			
			topo = pilha.Pop();
			if (topo != '(' && topo != ')') {
				this.exprPosFixa = this.exprPosFixa +" " +topo;
			}
		}
		
		return this.exprPosFixa;
	}
	
	public Double Calcula(String exprPosFixa) {
		
		Pilha<Double> pilha = new Pilha<>();
		Scanner scanner = new Scanner(exprPosFixa);
		
		while(scanner.hasNext()){
			
			if (scanner.hasNextDouble()) {
				pilha.Push(scanner.nextDouble());
			}
			
			if (scanner.hasNext("[+-/*]")) {
				
				Double	rhs = pilha.Pop();
				Double	lhs = pilha.Pop();
				
				switch(scanner.next()){
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
		}		
		return pilha.Pop();
	}
}
