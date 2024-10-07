package AssignmenDataStructures;
import java.util.Scanner;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size=0;


    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
           temp= temp.next;
        }
        System.out.println();
    }


    public void removeAtIndex(int index) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            previous = current;
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        previous.next = current.next;
        size--;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();


        System.out.println("Enter 4 values for the linked list:");
        for (int i = 0; i < 4; i++) {

            int value = scanner.nextInt();
            linkedList.append(value);
        }


        System.out.print("Current linked list: ");
        linkedList.display();


        System.out.print("Enter the index of the element to remove: ");
        int indexToRemove = scanner.nextInt();
        linkedList.removeAtIndex(indexToRemove);


        System.out.print("Linked list after removal: ");
        linkedList.display();

        scanner.close();
    }
}

