import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1 ,2 ,3, 1, 4 ,2,3,4};
        System.out.println("first non repeating no: "+firstNonRepeatingNumber(arr));
    }

    private static int firstNonRepeatingNumber(int[] arr) {
        LinkList ll = new LinkList();
        HashMap<Integer, Node> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                ll.removeNode(map.get(arr[i]));
            }
            else{
                Node node = new Node(arr[i]);
                map.put(arr[i], node);
                ll.addNode(node);
            }
        }
        return ll.getFirstElement();
    }
}