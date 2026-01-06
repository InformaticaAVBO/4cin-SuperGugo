// doubly linked list
public class List<T> {
    private Node<T> _root; // inefficiente? converrebbe avere un pointer al primo (e ultimo) nodo
    private int _length;

    List() {
        _root = new Node<>((Node<T>)null, (Node<T>)null, null);
    }

    private Node<T> lastItem() {
        Node<T> t = _root;
        while (t.get_next() != null) t=t.get_next(); return t;
    }

    private Node<T> firstItem() {
        Node<T> t = _root;
        while (t.get_prev() != null) t=t.get_prev(); return t;
    }

    public void add_tail(T value) {
        Node<T> t = lastItem();  _length++;
        if (t.get_value() == null) t.set_value(value); else t.set_next(new Node<T>(t, (Node<T>)null, value));
    }

    public void add_head(T value) {
        Node<T> t = firstItem(); _length++;
        if (t.get_value() == null) t.set_value(value); else t.set_prev(new Node<T>((Node<T>)null, t, value));
    }

    public int length() {
        return _length;
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException {
        Node<T> t = firstItem();
        while (index-->0) {
            t = t.get_next();
            if (t == null) throw new ArrayIndexOutOfBoundsException("Index out of bounds for list size "+Integer.toString(length()));
        }
        return t.get_value();
    }

    public void splice(int index) throws ArrayIndexOutOfBoundsException {
        Node<T> t = firstItem();
        while (index-->0) {
            t = t.get_next();
            if (t == null) throw new ArrayIndexOutOfBoundsException("Index out of bounds for list size "+Integer.toString(length()));
        }
        Node<T> prev = t.get_prev();
        Node<T> next = t.get_next();
        if (prev!=null) prev.set_next(next);
        if (next!=null) next.set_prev(prev);
        _length--;
    }

    public void insert(int index, T value) throws ArrayIndexOutOfBoundsException {
        if (index == _length) {
            add_tail(value);
        } else {
            Node<T> t = firstItem();
            while (index-->0) {
                t = t.get_next();
                if (t == null) throw new ArrayIndexOutOfBoundsException("Index out of bounds for list size "+Integer.toString(length()));
            }
            Node<T> prev = t.get_prev();
            Node<T> nn = new Node<>(prev, t, value);
            t.set_prev(nn);
            prev.set_next(nn);
            _length++;
        }
    }

    @Override
    public String toString() {
        Node<T> t = firstItem();
        String s = "[ " + t.get_value().toString();
        while ((t = t.get_next()) != null) s += ", " + t.get_value().toString();
        return s+" ]";
    }

}