package LinkedList;

// Question
// Implement a singly linked list

class Node // Node class to represent each element in the linked list
{
    int data; // Data stored in the node
    Node next; // Pointer to the next node in the list

    Node(int data) // Constructor to initialize the node with data and set the next pointer to null
    {
        this.data = data;
        this.next = null;
    }
}

public class Linkedlist // Linkedlist class to manage the linked list operations
{

    Node head; // Head pointer to the first node in the list

    public void add(int data) // Method to add a new node at the end of the list
    {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newnode;

    }

    public void inserthead(int data) // Method to insert a new node at the beginning of the list
    {
        Node newnode = new Node(data);

        newnode.next = head;
        head = newnode;
    }

    public void delete(int data) // Method to delete a node with the specified data from the list
    {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }

    }

    public void print() // Method to print the elements of the linked list
    {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        Linkedlist hey = new Linkedlist();

        hey.add(10);
        hey.add(20);
        hey.inserthead(0);
        hey.delete(20);
        hey.print();
    }

}
