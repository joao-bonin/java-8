package removeIf;

import java.util.ArrayList;
import java.util.List;

public class RemovendoPontos {
	
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
		
		
		/*
		 * Maneira verbosa, podemos melhorar!
		 */
//		Predicate<Usuario> predicate = new Predicate<Usuario>() {
//			@Override
//			public boolean test(Usuario t) {
//				return t.getPontos() > 160;
//			}
//		};
//		
//		
//		usuarios.removeIf(predicate);
		
		
		usuarios.removeIf(u -> u.getPontos() > 160);
		usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
		
	}

}
