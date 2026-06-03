class LRUCache {
    class Node {
        int key;
        int value;

        Node prev;
        Node next;
    }

    Node(int key,int value){
        this.key=key;
        this.value=value;
    }

    HashMap<Integer, Node> map;
    Node head;
    Node tail;

    int capacity;

    public LRUCache(int capacity) {

        this.capacity = capacity;

       HashMap<Integer, Node> map= new HashMap<>();

        head(0, 0);
        tail(0, 0);

        head.next = tail;
        tail.prev = head;
    }
    
    private void remove(Node node) {
        node.prev.next = node.next.next;
        node.next.prev = node.prev;
    }

    private void insert(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {
        if (!map.containskey(key)) {
            return -1;
        }
        Node node = map.get(key);

        remove(node);
        insert(node);

        return node.val;
        
    }
    
    public void put(int key, int value) {
        
        if (map.containskey(key)) {
           Node node=map.get(key);
           node.val = val;
           delete(node);
           insert(node);
       } else {
            
           if (map.size() == capacity) {
               Node tail = tail.prev;
               remove(tail);
               map.remove(tail.key);
           }
           Node newNode = new Node();
           insert(newNode);
           map.put(key, newNode);
        }
    }
}