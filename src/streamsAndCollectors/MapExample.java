package streamsAndCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExample {

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

        //Utilizando o Map para listar apenas um atributo de um objeto

        List<Integer> pontos = usuarios.stream()
                .map(Usuario::getPontos)
                .collect(Collectors.toList());

        //Para evitar o overhead, causado pelo boxing. Podemos utilizar streans especificas
/*        IntStream intStream = usuarios.stream()
                .mapToInt(Usuario::getPontos);*/
        //Com isso podemos chamar funções especiais
        double pontuaçãoMedia = usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .average()
                .getAsDouble();

        System.out.println(pontuaçãoMedia);

        //pontos.forEach(System.out::println);
    }
}
