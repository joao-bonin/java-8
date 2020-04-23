package lambda;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

class LambdaInterfaceFuncional {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario("João Bonin", 150);
		Usuario usuario2 = new Usuario("Mariana Barbino", 120);
		Usuario usuario3 = new Usuario("Sebastian", 190);

		List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3);

		// Maneira antiga implemetada desde o Java 1.5
//		for(Usuario usuario : usuarios) {
//			System.out.println(usuario.getNome());
//		}

		// Forma desnecessária
//		Mostrador mostrador = new Mostrador();
//		usuarios.forEach(mostrador);

		// O uso de classe anonima ainda não é o ideal, pois não podemos referencia-lá
//		Consumer<Usuario> mostrador = new Consumer<Usuario>() {
//			@Override
//			public void accept(Usuario t) {
//				System.out.println(t.getNome());
//			}
//		};
//		
//		usuarios.forEach(mostrador);

		// Maneira enxuta, mas ainda verbosa.
//		usuarios.forEach(new Consumer<Usuario>() {
//			@Override
//			public void accept(Usuario t) {
//				System.out.println(t.getNome());
//			}
//		});

		/*
		 * ***QUE ENTRE O LAMBDA!***
		 *
		 * O LAMBDA É UMA MANEIRA MAIS SIMPLES DE IMPLEMETAR UMA INTERFACE QUE POSSUA
		 * SOMENTE UM MÉTODO.
		 */

		/*
		 * O compilador percebe que você o está atribuindo a um Consumer<Usuario> e vai
		 * tentar jogar esse código no único método que essa in- terface define. Repare
		 * que não citamos nem a existência do método accept ! Isso é inferido durante o
		 * processo de compilação.
		 */

//		Consumer<Usuario> mostrador = (Usuario u) -> {
//			System.out.println(u.getNome());
//		};

		/*
		 * Podemos ir além. O compilador consegue também inferir o tipo, sem a necessi-
		 * dade de utilizar Usuario , nem parênteses:
		 */

//		Consumer<Usuario> mostrador = u -> {
//			System.out.println(u.getNome());
//		};

		/*
		 * Não está satisfeito? Caso o bloco dentro de { } contenha apenas uma
		 * instrução, podemos omiti-lo e remover também o ponto e vírgula:
		 */

//		Consumer<Usuario> mostrador = u -> System.out.println(u.getNome());

		/*
		 * Podemos passar esse trecho de có- digo diretamente para usuarios.forEach em
		 * vez de declarar a variável tempo- rária mostrador :
		 */

		usuarios.forEach(u -> System.out.println(u.getNome()));

		// Tornando todos os usuarios moderadores

		usuarios.forEach(u -> u.tornaModerador());

		/*
		 * Podemos dizer então que toda interface do Java que possui apenas um método
		 * abstrato pode ser instanciada como um código lambda!
		 */

		// Exemplo com a interface Runnable (Modo Convencional)
//		Runnable r = new Runnable() {
//			public void run() {
//				for (int i = 0; i <= 1000; i++) {
//					System.out.println(i);
//				}
//			}
//		};
//		new Thread(r).start();

		/*
		 * Uma interface que se enquadre nesse requisito é agora conhecida como uma
		 * interface funcional! Ela sempre pode ser instanciada através de uma expressão
		 * lambda:
		 */
		
//		Runnable r = () -> {
//			for(int i = 0; i <= 1000; i++) {
//				System.out.println(i);
//			}
//		};
//		new Thread(r).start();
		
		
		//Indo além
		
		new Thread(() -> {
			for(int i = 0; i <= 1000; i++) {
				System.out.println(i);
			}
		}).start();

	}

}
