class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node1 front, rear;

    // Add element (Enqueue)
    void enqueue(int data) {
        Node1 newNode = new Node1(data);

        if (rear == null) { // if queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " added to the queue");
    }

    // Remove element (Dequeue)
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty, nothing to remove!");
            return;
        }

        System.out.println(front.data + " removed from the queue");
        front = front.next;

        if (front == null) // queue became empty
            rear = null;
    }

    // Show front element
    void peek() {
        if (front == null)
            System.out.println("Queue is empty");
        else
            System.out.println("Front element is: " + front.data);
    }

    // Display all elements
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node1 temp = front;
        System.out.print("Queue elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class TestQueue {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.peek();

        q.dequeue();
        q.display();

        q.dequeue();
        q.display();

        q.dequeue();
        q.display();

        q.dequeue(); // removing from empty queue
    }
}
