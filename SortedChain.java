class SortedChain {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    public SortedChain() {
        head = null;
    }
    public void insert(int data) {
        Node newnode = new Node(data);
        if (head == null || head.data >= data) {
            newnode.next = head;
            head = newnode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }
        newnode.next = current.next;
        current.next = newnode;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SortedChain list = new SortedChain();
        list.insert(5);
        list.insert(3);
        list.insert(8);
        list.insert(1);
        list.insert(6);
        list.printList();  
    }
}