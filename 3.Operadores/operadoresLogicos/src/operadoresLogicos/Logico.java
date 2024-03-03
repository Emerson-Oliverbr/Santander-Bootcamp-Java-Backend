package operadoresLogicos;

public class Logico {
	public static void main(String []args) {
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if(condicao1 && condicao2 == true) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		
		if(condicao1 || condicao2 == true) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if(condicao1 != condicao2 == true) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
	}
}
