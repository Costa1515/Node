import java.util.Objects;

public class LL<T> {
    Node<T> root;

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (Objects.isNull(root)) {
            root = new Node<T>(value);
            return;
        }
        Node<T> node1 = root;
        while (node1.next != null) {
            node1 = node1.next;
        }
        node1.next = new Node<T>(value);
    }

    public T get(int index) {
        Node<T> node = root;
        int counter = 0;
        while (counter != index) {
            node = node.next;
            counter++;
        }
        return node.value;
    }

    public void delete(int index) {
        Node<T> node = root;
        Node<T> previous = null;
        int count = 0;
        while (count != index) {
            previous = node;
            node = node.next;
            count++;
        }
        previous.next = node.next;
    }


    public void add(int index, T value) {
        if (root.next == null || root == null) {
            add(value);
            return;
        }
        int counter = 0;
        Node<T> node = root;
        Node<T> previous = root;
        while (counter != index) {
            previous = node;
            node = node.next;
            counter++;
        }
        previous.next = new Node<>(value);
    }
}
