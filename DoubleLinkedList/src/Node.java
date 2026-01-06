public class Node<T> {
    private Node<T> _prev;
    private Node<T> _next;
    private T _value;

    public Node(Node<T> prev, Node<T> next, T value) {
        _prev = prev;
        _next = next;
        _value = value;
    }

    public Node<T> get_next() {
        return _next;
    }

    public Node<T> get_prev() {
        return _prev;
    }

    public T get_value() {
        return _value;
    }

    public void set_next(Node<T> _next) {
        this._next = _next;
    }

    public void set_prev(Node<T> _prev) {
        this._prev = _prev;
    }

    public void set_value(T _value) {
        this._value = _value;
    }
}
