package co_complejos_UD_POO88;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complejo gus = new Complejo(0,0);
		Complejo gus2 = new Complejo(0,0);
		gus.leer();
		gus2.leer();
		
		Complejo suma = gus.div(gus,gus2);
		gus.imprimir(suma);
		

	}

}
