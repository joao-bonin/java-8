package streamscomplexas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsComplexas {

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

        //Filtrando ordenando e colentando
//        List<Usuario> usuariosComMais100Pontos = usuarios.stream()
//                .filter(u -> u.getPontos() > 100)
//                .sorted(Comparator.comparing(Usuario::getNome))
//                .collect(Collectors.toList());
//
//        usuariosComMais100Pontos.forEach(u -> System.out.println(u.getNome()));

        //Buscando qualquer usuario com mais de 100 pontos
//        Optional<Usuario> usuarioQualquer = usuarios.stream()
//                .filter(u -> u.getPontos() > 100)
//                .findAny();
//
//        if(usuarioQualquer.isPresent()){
//            System.out.println(usuarioQualquer.get().getNome());
//        }

        //Enxergando a execução do pipeline com Peek
//        usuarios.stream()
//                .filter(u -> u.getPontos() > 100)
//                .peek(System.out::println)
//                .findAny();

        usuarios.stream()
                .sorted(Comparator.comparing(Usuario::getNome))
                .peek(System.out::println)
                .findAny();


    }



}
