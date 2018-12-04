package linkedsetsimple.structs;
import java.util.Collection;
public class MyLinkedSet<E> extends MySet<E> {
    /**
     * Construye un nuevo HashSet con una cantidad a almacenar por 
     * defecto (usando el constructor heredado de MySet)
     */
    public MyLinkedSet() {
        super(4,true);
    }
    /**
     * Construye un nuevo HashSet según la cantidad de elementos que
     * deseamos almacenar (usando el constructor heredado de MySet)
     * 
     * @param xcap -> capacidad de elementos a almacenar 
     */
    public MyLinkedSet(int xcap) {
        super(xcap,true);
    }
    /**
     * Construye un nuevo HashSet que utilizamos para almacenar toda una 
     * estructura de datos tipo collection a nuestra estructura de datos
     * (usando el constructor heredado de MySet)
     * 
     * @param c 
     */
    public MyLinkedSet(Collection<? extends E> c) {
        super(c.size(),true);
        addAll(c);
    }
    /**
     * Obtiene el primer elemento de la estructura de datos
     * 
     * @return E -> elemento 
     */
    public E first(){
        return (E) ((MyLinkedMap)map).firstKey();
    }
    /**
     * Obtiene el último elemento de la estructura de datos
     * 
     * @return E -> elemento 
     */
    public E last(){
        return (E) ((MyLinkedMap)map).lastKey();
    }
}