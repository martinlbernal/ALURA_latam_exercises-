package java_primeros_pasos;

public class Ejemplo_PruebaVariables {

		

		public static void main (String[] args) {
			
			//CONOCIENDO EL TIPO DATO ENTERO
			
			int edad=34;
			System.out.println("Su edad es de "+edad+" años");
			
				edad=39;
				System.out.println("Su edad es de "+edad+" años");
				
			//CONOCIENDO EL TIPO DE DATO DOUBLE
				double peso=34.89;
				System.out.println("Su peso es de "+peso+" años");
				
				double peso2=78.98;
				System.out.println("Su diferencia de peso fue de "+(peso2-peso)+" ,restando la difrencia de sus kg en diferentes años");
				
			//CONVERTIR UN TIPO DE DATO EN OTRO: CAST
				
				double altura=1.81;
				int alturaMetros = (int) altura;
				System.out.println(alturaMetros);
				
				
			//CARACTERES
				
				//CHAR
				
				char letraAlfabeto='a'; //SE USA UNA SOLA COMILLA
				System.out.println(letraAlfabeto);
				
				//También puedo poner números y automáticamente traerá su referencia del código ascki. 
				letraAlfabeto=65;
				System.out.println(letraAlfabeto);
				
				//sumo estos números referenciados
				letraAlfabeto=65+1;
				System.out.println(letraAlfabeto);
				
				//vuelvo a convertir
				char letraAlfabeto2=(char) (letraAlfabeto+87);
				System.out.println(letraAlfabeto2);
				
				//STRING
				
				
		}
		
}
