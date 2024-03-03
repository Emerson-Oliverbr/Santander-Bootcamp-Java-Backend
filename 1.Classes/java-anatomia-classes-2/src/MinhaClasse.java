
public class MinhaClasse {
	public static void main(String [] args) {
		
		String primeiroNome = "emerson";
		String sobreNome = "Oliveira";
		int anoNascimento = 1985;
		boolean verdadeira = true;
		
		primeiroNome = "Emerson";
		
		System.out.println(primeiroNome);
		System.out.println(sobreNome);
		System.out.println(anoNascimento);
		System.out.println(verdadeira);	
		
		String nomeCompleto = nomeCompleto (primeiroNome, sobreNome);
		System.out.println(nomeCompleto);
	}
	
	public static String nomeCompleto (String primeiroNome, String sobreNome) {
		return "Resultado do método: " + primeiroNome.concat(" ").concat(sobreNome);
	}

}
