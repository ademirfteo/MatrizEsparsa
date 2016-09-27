package controller;

import model.SpreadsheetModel;
import view.Spreadsheet;

public class CalcMachine {
	
	private Matriz matriz;
	
	public CalcMachine() {
		matriz = new Matriz();
	}

	public static void main(String[] args) {
		(new CalcMachine()).run();
	}

	private void run() {
		SpreadsheetModel m = new SpreadsheetModel() {

			@Override
			public String getValue(String cell) {
				return matriz.ShowResult(getFormula(cell));
			}

			@Override
			public String getFormula(String cell) {
				return matriz.ShowFormula(cell);
			}

			@Override
			public void setFormula(String cell, String formula) {
				if (!formula.isEmpty()) {
					matriz.CreateCel(cell, formula);
				} else {
					matriz.ErasesValue(cell);
				}
				//matriz.ShowMatriz();
			}
		};
		
		(new Spreadsheet(m)).start();
	}
}
