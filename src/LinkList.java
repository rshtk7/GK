public class LinkList {
    Node head=null;
    Node tail=null;

    public void removeNode(Node node) {
        if(node.prev==null){
            node = node.next;
            head = node;
            return;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;

    }

    public void addNode(Node node) {
        Node temp=head;
        if(head==tail){
            if(head==null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = tail.next;
            }
        }
        else{
            tail = tail.next
        }
//        if(temp==null){
//            head = node;
//            return;
//        }
//        while(temp.next!=null){
//            temp  = temp.next;
//        }
//        temp.next = node;
//        node.prev = temp;
    }

    public int getFirstElement() {
        if(head==null)return -1;
        return head.key;
    }
}
