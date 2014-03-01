package evil.ducks.fun;

import java.util.Iterator;

public class Sequence<T> implements Iterable<T> {
    public static Sequence<?> Nil = new Sequence();

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }
}
