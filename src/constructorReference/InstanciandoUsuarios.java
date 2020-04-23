package constructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

public class InstanciandoUsuarios {
	
	public static void main(String... args) {
	
	//Instancia um objeto simples 
	Supplier<Usuario> criaUsuarios = Usuario::new;
	Usuario usuario = criaUsuarios.get();
	
	
	Function<String, Usuario> criadorUsuarios = Usuario::new;
	
	Usuario joao = criadorUsuarios.apply("João Bonin");
	Usuario mariana = criadorUsuarios.apply("Mariana");

		
	}

}
