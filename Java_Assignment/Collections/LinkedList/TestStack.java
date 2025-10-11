class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top; // top of the stack

    // push element onto stack
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed into stack");
    }

    // remove the top element
    void remove() {
        if (top == null) {
            System.out.println("Stack is empty, nothing to remove!");
        } else {
            System.out.println(top.data + " removed from stack");
            top = top.next; // remove first node
        }
    }

//    // peek at top element
//    void peek() {
//        if (top == null)
//            System.out.println("Stack is empty");
//        else
//            System.out.println("Top element is: " + top.data);
//    }

    
    // display all elements
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();

        s.remove();  // removes 30
        s.display();

        s.remove();  // removes 20
        s.display();

        s.remove();  // removes 10
        s.display();

        s.remove();  // stack empty message
    }
}
