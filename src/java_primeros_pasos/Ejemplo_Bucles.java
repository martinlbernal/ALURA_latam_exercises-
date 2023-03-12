package java_primeros_pasos;

public class Ejemplo_Bucles {

	public static void main(String[] args) {
		/*int contador = 0;
		
		while (contador < 10) {
			System.out.println(contador);
			contador ++;
			
		}  
		
		
		for(int contador2 = 0; contador2 <= 10; contador2++) {
            System.out.println(contador2);
        }
		*/
		
		//MATRIZ
		
		for (int columna = 0; columna <= 10; columna++) {
			for (int fila = 0; columna > fila ; fila++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
		
	}
	
	
}
