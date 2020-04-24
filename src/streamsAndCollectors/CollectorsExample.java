package streamsAndCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {

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

		//Padrão utilizado com as interfaces funcionais.
//		Supplier<ArrayList<Usuario>> supplier = ArrayList::new;
//		BiConsumer<ArrayList<Usuario>, Usuario> accumulator = ArrayList::add;
//		BiConsumer<ArrayList<Usuario>, ArrayList<Usuario>> combiner = ArrayList::addAll;
//
//		List<Usuario> maisQue100 = usuarios.stream()
//				.filter(u -> u.getPontos() > 100)
//				.collect(supplier, accumulator, combiner);

		//Reduzindo as instruções, mas mesmo assim muito verboso
//		ArrayList<Object> maisQue100 = usuarios.stream()
//				.filter(u -> u.getPontos() > 100)
//				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

		//Forma reduzida, ainda podemos melhorar realizando um import estatico no collectors
/*		List<Usuario> maisQue100 = usuarios.stream()
				.filter(u -> u.getPontos() > 100)
				.collect(toList());*/

		//Exemplo utilizando o toCollection()
		List<Usuario> maisQue100 = usuarios.stream()
				.filter(u -> u.getPontos() > 100)
				.collect(Collectors.toCollection(ArrayList::new));

		maisQue100.forEach(System.out::println);

	}

}
