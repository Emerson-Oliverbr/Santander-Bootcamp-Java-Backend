package operadoresRelacionais;

public class Relacionais {
	public static void main(String[] args) {
		int numero1 = 1;
		int numero2 = 2;

		boolean simNao = numero1 == numero2;

		System.out.println("Numero1 é igual a Numero2? " + simNao);

		simNao = numero1 != numero2;

		System.out.println("Numero1 é igual a Numero2? " + simNao);
		
		if(numero1 < numero2) {
			System.out.println("A nossa condição é verdadeira");
		}
		else {
			System.out.println("A nossa condição é falsa");
		}
	}

}
