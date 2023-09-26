package Principal;

/********************************
 * TP N° 4 - Desafio 4          *
 * - Collection -               *
 *  by @author FernandoFernando *
 ********************************/

public class Main {

	public static void main(String[] args) {
		
		
		
		CollectionCustom<Integer> customCollection = new CollectionCustom<>();

        customCollection.add(1);
        customCollection.add(2);
        customCollection.add(3);
        customCollection.add(2);
        customCollection.add(4);
        customCollection.add(5);
        customCollection.add(5);
        customCollection.add(22);
        customCollection.add(6);
        customCollection.add(7);
        customCollection.add(5);
        
        
        

        System.out.println("Elementos en la colección: " + customCollection.size());
        System.out.println("Contenido de la colección: " + customCollection);

        int removedElement = customCollection.remove(5);
        System.out.println("Elemento removido: " + removedElement);
        System.out.println("Contenido después de remover el primer 5: " + customCollection);

        customCollection.removeAll(5);
        System.out.println("Contenido después de remover todos los 5: " + customCollection);
        
        customCollection.addFirst(10);
        System.out.println("Elmentos de la coleccion (se agrega un elemento al principio): " + customCollection);
        
        customCollection.addLast(99);
        System.out.println("Elmentos de la coleccion (se agrega un elemento al final): " + customCollection);

        System.out.println("¿La colección está vacía? " + customCollection.isEmpty());
        
        
        
        
        

	}

}
