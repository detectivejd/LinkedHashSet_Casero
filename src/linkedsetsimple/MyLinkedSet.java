package linkedsetsimple;
import java.util.Collection;
public class MyLinkedSet<E> extends MySet<E>
{
    public MyLinkedSet() {
        super(4,true);
    }
    public MyLinkedSet(int xcap) {
        super(xcap,true);
    }
    public MyLinkedSet(Collection<? extends E> c) {
        super(c.size(),true);
        addAll(c);
    } 
}