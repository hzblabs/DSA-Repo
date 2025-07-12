public class TestDoubleList {
    public static void main(String[] args) {
        doublelist list = new doublelist();

        // Add elements to the end
        list.add(10);
        list.add(20);
        list.add(30);

        // Insert at the head
        list.inserthead(5);

        // Print the current list
        System.out.println("Initial list:");
        list.print();

        // Delete an element
        list.delete(20);

        // Print after deletion
        System.out.println("After deleting 20:");
        list.print();

        // Delete head
        list.delete(5);
        System.out.println("After deleting 5 (head):");
        list.print();
        list.backward();
    }
}
