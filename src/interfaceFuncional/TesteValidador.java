package interfaceFuncional;

public class TesteValidador {

	public static void main(String... args) {

		/*
		 * Implementando de forma clásica, com classe anônima
		 */
		
//		Validador<String> validaCEP = new Validador<String>() {
//			@Override
//			public boolean valida(String t) {
//				return t.matches("[0-9]{5}-[0-9]{3}");
//			}
//		};

		/*
		 * Como trata-se de apenas uma instrução, podemos remover o return
		 */
		
//		Validador<String> validaCEP = valor -> {
//			return valor.matches("[0-9]{5}-[0-9]{3}");
//		};

		Validador<String> validaCEP = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
		System.out.println(validaCEP.valida("86020-410"));

	}

}
