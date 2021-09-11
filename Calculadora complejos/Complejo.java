package co_complejos_UD_POO88;

import java.util.Scanner;

public class Complejo {
	
	private double real;
	private double compl;
	private static Complejo res;
	
	public Complejo(double real, double compl) {
		
		this.real = real;
		this.compl = compl;		
		
		
		
	}
	
	public double getReal() {
		
		return this.real;
		
	}
	
	
	public  Complejo suma(Complejo uno, Complejo dos) {
		
		res = new Complejo(uno.real + dos.real,uno.compl+dos.compl);
		
		
		return res;
		
				
	}
	
	public  Complejo resta(Complejo uno, Complejo dos) {
		
		res = new Complejo(uno.real - dos.real,uno.compl-dos.compl);
		
		
		return res;
		
				
	}
	public  Complejo mult(Complejo uno, Complejo dos) {
		
		res = new Complejo(uno.real*dos.real,uno.compl*dos.compl);
		
		
		return res;
		
				
	}
	public  Complejo cpm(Complejo uno) {
		
		res = new Complejo(uno.real, uno.compl*(-1));
		
		
		return res;
		
				
	}
	public Complejo div(Complejo uno, Complejo dos) {
		 Complejo div = this.mult(uno,this.cpm(dos));
		 Complejo div2 = this.mult(dos, this.cpm(dos));
		 
		  return new Complejo(div.real/div2.real,div.compl/div2.real);
		
	
				
	}
	
	public void leer(){
		   System.out.println("ingrese la parte real y la parte imaginaria");
		   Scanner s = new Scanner(System.in);
		   this.real=s.nextDouble();
		   this.compl=s.nextDouble();
		}
	
	 public void imprimir(Complejo c){
		  System.out.println(c.real+"+"+c.compl+"i");
		}

}
