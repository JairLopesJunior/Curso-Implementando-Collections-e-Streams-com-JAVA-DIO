package optional;

import java.util.Optional;

public class ExemplosOptionalEstados {

	public static void main(String[] args) {
		
		Optional<String> optionalString = Optional.of("valor presente");
		
		System.out.println("Valor opcional que está presente");
		optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("Não esta presente"));

		Optional<String> optionalNull = Optional.ofNullable(null);
		
		System.out.println("Valor opcional que não está presente");
		optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = Não esta presente"));
		
		Optional<String> emptyOptional = Optional.empty();
		
		System.out.println("Valor opcional que não está presente");
		emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("empty = Não esta presente"));
		
		Optional<String> optionalNullErro = Optional.of(null);
		
		System.out.println("Valos opcional que lança erro NullPointerException");
		optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro = Não esta presente"));
	}

}
