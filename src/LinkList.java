public class LinkList {
    Node head=null;

    public void removeNode(Node nodeToDelete) {
        if (head == null || nodeToDelete == null) return;

        if (nodeToDelete == head) {
            head = head.next;
        }
        if (nodeToDelete.prev != null) {
            nodeToDelete.prev.next = nodeToDelete.next;
        }
        if (nodeToDelete.next != null) {
            nodeToDelete.next.prev = nodeToDelete.prev;
        }
        nodeToDelete.prev = null;
        nodeToDelete.next = null;

    }

    public void addNode(Node node) {
        if (head == null) {
            head = node;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        node.prev = current;
    }

    public int getFirstElement() {
        if(head==null)return -1;
        return head.key;
    }
}
