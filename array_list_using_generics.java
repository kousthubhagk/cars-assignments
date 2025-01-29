
import java.util.Arrays;

public class array_list_using_generics<T> {
    private Object[] elements;
    private int size = 0;
    private static final int INITIAL_CAPACITY = 10;

    // Constructor
    public array_list_using_generics() {
        elements = new Object[INITIAL_CAPACITY];
    }

    // Add element to the list
    public void add(T element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    // Ensure capacity for more elements
    private void ensureCapacity() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    // Get an element from the list by index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    // Remove an element from the list by index
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print all elements
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        array_list_using_generics<String> list = new array_list_using_generics<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        list.printList();  // Output: Alice Bob Charlie

        System.out.println("Element at index 1: " + list.get(1)); // Output: Bob

        list.remove(1);
        list.printList();  // Output: Alice Charlie

        System.out.println("Size of list: " + list.size()); // Output: 2
    }
}
