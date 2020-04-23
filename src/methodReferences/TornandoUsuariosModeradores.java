package methodReferences;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.Comparator.nullsLast;
import java.util.List;
import java.util.function.Function;

public class TornandoUsuariosModeradores {

	public static void main(String... args) {

		Usuario usuario1 = new Usuario("João Bonin", 150);
		Usuario usuario2 = new Usuario("Mariana Barbino", 120);
		Usuario usuario3 = new Usuario("Sebastian", 190);
		Usuario usuario4 = new Usuario("Maria Antonieta", 159);
		Usuario usuario5 = new Usuario("Renata Carvalho", 350);
		Usuario usuario6 = new Usuario("Mika Mota", 120);
		Usuario usuario7 = new Usuario("Jack Ozelin", 100);
		Usuario usuario8 = new Usuario("Fernando Guerra", 50);

		List<Usuario> usuarios = new ArrayList<>();

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		usuarios.add(usuario5);
		usuarios.add(usuario6);
		usuarios.add(usuario7);
		usuarios.add(usuario8);

		/**
		 * da mesma forma como uma expressão lambda, o method reference é traduzido para
		 * uma interface funcional!
		 */
		usuarios.forEach(Usuario::tornaModerador);
		
		// Utilizando o Comparing
		//usuarios.sort(comparing(Usuario::getNome));
		
		//Utilizando o Comparing de forma fluente
//		Function<Usuario, String> byName = Usuario::getNome;
//		usuarios.sort(comparing(byName));
		
		
		//Utilizando os default methods da interface Comparator
		usuarios.sort(comparingInt(Usuario::getPontos)
				.thenComparing(Usuario::getNome)
				.reversed());
		
		
		
		usuarios.forEach(System.out::println);

	}

}
