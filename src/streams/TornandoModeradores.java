package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class TornandoModeradores {

	public static void main(String[] args) {

		Usuario usuario1 = new Usuario("João Bonin", 150);
		Usuario usuario2 = new Usuario("Mariana Barbino", 120);
		Usuario usuario3 = new Usuario("Sebastian", 190);
		Usuario usuario4 = new Usuario("Maria Antonieta", 90);

		List<Usuario> usuarios = new ArrayList<>();

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);

		/**
		 * É muito importante saber que o Stream não tem efeito colateral sobre a
		 * coleção que o originou. Por isso, sempre que aplicamos uma transformação em
		 * um Stream , como fize- mos com o filter, ele nos retorna um novo Stream com o
		 * resultado:
		 */
//		Stream<Usuario> filter = usuarios.stream().filter(u -> u.getPontos() > 100);
//
//		filter.forEach(System.out::println);

		// Podemos encadear as invocações ao Stream de maneira fluente.
		//usuarios.stream().filter(u -> u.getPontos() > 100).forEach(System.out::println);

		/**
		 * De qualquer maneira, o Stream é desenhado para que você utilize-o apenas uma
		 * vez. Caso queira realizar novas operações, você deve invocar stream() na
		 * coleção mais uma vez, obtendo um novo.
		 */
		
		usuarios.stream()
			.filter(u -> u.getPontos() > 100)
			.forEach(Usuario::tornaModerador);
		
		usuarios.stream()
			.filter(Usuario::isModerador)
			.forEach(System.out::println);

	}

}
