

// Definition for QueueUsingLL class
public class QueueUsingLL<T> 
{
    // Node class representing each node in the singly linked list
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> front; // Front of the queue
    private Node<T> rear;  // Rear of the queue
    private int size;      // Size of the queue

    // Constructor to initialize an empty queue
    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Method to remove and return the front element of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    // Method to return the front element of the queue without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.data;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Method to return the size of the queue
    public int size() {
        return size;
    }
