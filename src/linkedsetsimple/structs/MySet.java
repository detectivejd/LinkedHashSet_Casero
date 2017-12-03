package linkedsetsimple.structs;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public class MySet<E> implements Set<E>
{
    private MyMap<E,Object>map;
    private final Object PRESENT = new Object();
    public MySet() {
        map = new MyMap();
    }
    public MySet(int xcap) {
        map = new MyMap(xcap);
    }
    public MySet(Collection<? extends E> c) {
        this(c.size());
        this.addAll(c);
    }
    MySet(int xcap, boolean dummy) {
        map = new MyLinkedMap(xcap);
    }
    /*----------------------------------------------------------*/
    @Override
    public int size() {
        return map.size();
    }
    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }
    @Override
    public void clear() {
        map.clear();
    }
    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }
    /*----------------------------------------------------------*/
    @Override
    public Object[] toArray() {
        Object[] array = new Object[map.size()];
        int i=0;
        for(E obj : map.keySet()){
            array[i] = obj;
            i++;
        }
        return array;
    }
    @Override
    public <T> T[] toArray(T[] a) {
        int i=0;
        for(E obj : map.keySet()){
            a[i] = (T)obj;
            i++;
        }
        return a;
    }
    /*----------------------------------------------------------*/
    @Override
    public boolean contains(Object o) {
        return map.containsKey((E)o);
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        if(c.size() > 0){
            return c.stream().noneMatch((e) -> (!this.contains((E)e)));
        }
        return false;
    }
    /*----------------------------------------------------------*/    
    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }
    @Override
    public boolean addAll(Collection<? extends E> c) {
        if(c.size() > 0){
            c.forEach((obj) -> {
                this.add(obj);
            });
            return true;
        }
        return false;
    }
    /*----------------------------------------------------------*/
    @Override
    public boolean remove(Object o) {
        return map.remove((E)o) == PRESENT;
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        if(c.size() > 0){
            c.stream().filter((obj) -> 
                (this.contains((E)obj))).forEachOrdered((obj) -> {
                    map.remove((E)obj);
            });
            return true;
        }
        return false;
    }
    /*----------------------------------------------------------*/    
    @Override
    public boolean retainAll(Collection<?> c) {
        if(c.size() > 0){
            map.keySet().stream().filter((e) -> 
                (!c.contains(e))).forEachOrdered((e) -> {
                    this.remove(e);
            });
            return true;
        }
        return false;
    }
}