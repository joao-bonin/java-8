package comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparadorComLambda {

	public static void main(String... args) {

		Usuario usuario1 = new Usuario("João Bonin", 150);
		Usuario usuario2 = new Usuario("Mariana Barbino", 120);
		Usuario usuario3 = new Usuario("Sebastian", 190);
		Usuario usuario4 = new Usuario("Maria Antonieta", 159);

		List<Usuario> usuarios = new ArrayList<>();

		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);

		/**
		 * Muito verboso, podemos refatorar
		 */
//		Comparator<Usuario> comparator = new Comparator<Usuario>() {
//			@Override
//			public int compare(Usuario u1, Usuario u2) {
//				return u1.getNome().compareTo(u2.getNome());
//			}
//		};

		/*
		 * Ainda podemos melhorar
		 */
//		Comparator<Usuario> comparator =
//				(u1, u2) -> u1.getNome().compareTo(u2.getNome());

		// Collections.sort(usuarios, (u1, u2) -> u1.getNome().compareTo(u2.getNome()));

		usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		
		/*
		 * Isso finalmente é possível pois existe um novo método default sort decla-
		 * rado na interface List , que simplesmente delega a invocação para o já
		 * conhecido Collections.sort :
		 */
		

		usuarios.forEach(u -> System.out.println(u.getNome()));
		
		
		/*
		 * Ordenando listas de Strings
		 */
		
		List<String> palavras =
				Arrays.asList("Casa do Código", "Alura", "Caelum");
		
		
		palavras.sort(Comparator.naturalOrder());
		//palavras.sort(Comparator.reverseOrder());
		
		palavras.forEach(p -> System.out.println(p));

	}

}
