package evil.ducks.fun;

import java.util.ArrayList;
import java.util.Iterator;

public class Sequence<T> implements Iterable<T> {
    public static Sequence<?> Nil = new Sequence();

    @Override
    public Iterator<T> iterator() {
        return new ArrayList<T>().iterator();
    }
}
