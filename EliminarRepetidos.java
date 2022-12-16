import java.util.*;

public class EliminarRepetidos{

	//crear una nueva lista eliminando repetidos
	//contar la cantidad de veces que un numero aparece repetido

	public static void main(String [] args){
		List<Integer> lista = new LinkedList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(1);
		lista.add(2);
		lista.add(1);
		lista.add(4);
		lista.add(4);
		lista.add(2);
		lista.add(4);
		lista.add(3);
		lista.add(1);
		new EliminarRepetidos().eliminarRepetidos(lista);

	}


	private void eliminarRepetidos(List lista){

		lista.forEach(x -> System.out.println(x));

		System.out.println("nothing happend");

	}

}
