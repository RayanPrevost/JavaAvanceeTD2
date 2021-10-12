package fr.dauphine.javaavance.td2;

public class SquareRoot implements Expr{
	private Expr expr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public SquareRoot( Expr exp) {
		 
		this.expr = exp;
	}
	
	@Override
	public double eval() {
		System.out.println("Utilisation de la racine carrée \u221a en cours...");
		double res = Math.sqrt(this.expr.eval());
		return res;
	}

	@Override
	public double getValeur() {
		// TODO Auto-generated method stub
		return 0;
	}

}
