package java_primeros_pasos;

public class Ejemplo_Condicionales2 {
	public static void main(String[] args) {

		int edad = 17;
		int persona = 2;

		if (edad >= 18) {
			System.out.println("Puede entrar");

		} else {
			if (persona >= 2) {
				System.out.println("eres menor de edad, pero puedes ingresar" + "porque estas con un mayor");
			} else {
				System.out.println("No puedes ingresar, lo lamento");
			}
		}

	}
}
