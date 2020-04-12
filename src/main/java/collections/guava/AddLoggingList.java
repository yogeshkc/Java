package collections.guava;

import com.google.common.collect.ForwardingList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
List decorator that logs all elements added to it
 */
public class AddLoggingList<E>
        extends ForwardingList<E> {
    private final List<E> list = new ArrayList<>();
    private final StringBuilder stringBuilder = new StringBuilder(64);

    @Override
    protected List<E> delegate() {
        return list;
    }

    @Override
    public void add(int index, E element) {
        stringBuilder.append(message(index, element));
        super.add(index, element);
    }

    @Override
    protected boolean standardAdd(E element) {
       throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> elements) {
       throw new UnsupportedOperationException();
    }

    @Override
    protected boolean standardAddAll(int index, Iterable<? extends E> elements) {
       throw new UnsupportedOperationException();
    }

    private String message(int index, E object) {
        return String.format("Adding %s to index %s\n", index, object);
    }

    public String getLog() {
        return stringBuilder.toString();
    }
}
