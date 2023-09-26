package Principal;

import java.util.Arrays;
import java.util.Objects;

public class CollectionCustom<T> {
	
	/* ATRIBUTOS */
	private static final int DEFAULT_CAPACITY = 10; // Capacidad por defecto
    private T[] array;
    private int size;
    
   
    
    /* CONSTRUCTOR */
     public CollectionCustom() {
        this(DEFAULT_CAPACITY);
    }
    
    
    
    public CollectionCustom(int capacidadInicial) {
        if (capacidadInicial <= 0) {
            throw new IllegalArgumentException("La capacidad inicial debe ser mayor que cero.");
        }
        this.array = (T[]) new Object[capacidadInicial];
        this.size = 0;
    }
        
        
     /* METODOS */
    
        // GET - Tamaño de Collection//
        public int size() {
            return size;
        }
        
        // SET - Genera mas capacidad en la coleccion a medida que agregamos elementos //
        private void capacidadSuficiente() {
            if (size == array.length) {
                int newCapacidad = array.length * 2;// multiplica el tamaño de array por 2 //
                array = Arrays.copyOf(array, newCapacidad);// copia el arreglo//
            }
        }

        // SET - Agrega Elemento e incrementa el tamaño de la colecion a medidad que se insertan elementos.//
        public void add(T element) {
            capacidadSuficiente(); // Asegura que haya suficiente capacidad (funcion creada en lineas de arriba)//
            array[size] = element;
            size++;
        }
        
        
        //GET - Remueve un Elemento de la coleccion que se pase por parametro//
        public T remove(T element) {
            for (int i = 0; i < size; i++) 
            {
                if (Objects.equals(array[i], element))
                {
                    T removedElement = array[i];
                    System.arraycopy(array, i + 1, array, i, size - i - 1);
                    size--;
                    return removedElement;
                }
            }
            return null; // Elemento no encontrado //
        }

        
        // SET - elimina el elemento repetido que se pasa por parametro//
        public void removeAll(T element) {
            int newSize = 0;
            for (int i = 0; i < size; i++) 
            {
                if (!Objects.equals(array[i], element)) 
                {
                    array[newSize] = array[i];
                    newSize++;
                }
            }
            size = newSize;
        }
        
        //Get - Retorna un boleano si esta vacio//
        public boolean isEmpty() {
            return size == 0; // true => size == 0 / false => size != 0 //
        }

        
        public void addFirst(T element) {
            capacidadSuficiente();
            System.arraycopy(array, 0, array, 1, size);
            array[0] = element;
            size++;
        }

        public void addLast(T element) {
            capacidadSuficiente();
            array[size] = element;
            size++;
        }
        
        public String toString() {
            return Arrays.toString(Arrays.copyOf(array, size));
        }


	
}
	




