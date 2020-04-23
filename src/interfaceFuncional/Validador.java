package interfaceFuncional;

/**
 * Anotamos a interface com @FunctionalInterface
 * Como segurança para não adicionarmos outros metódos
 * causando problemas de compilação
 * 
 * @author manolo
 *
 * @param <T>
 */

@FunctionalInterface
public interface Validador<T> {
	boolean valida(T t);
	
	
	//boolean buscar(T t);

}
