

class LRUCache {

    class Node
{
    int key;
    int value;

    Node next;
    Node prev;

    Node(int key,int value)
    {
        this.key=key;
        this.value=value;
    }
}
    private int capacity;
    private HashMap<Integer,Node> cache;
    private Node left;
    private Node right;
    public LRUCache(int capacity) {
        this.capacity=capacity;

        cache=new HashMap<>();
        left=new Node(0,0);
        right = new Node(0,0);
        left.next=right;
        right.prev=left;
    }
    private void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void insert(Node node) {
        Node prev = right.prev;
        Node next = right;

        prev.next = node;
        next.prev = node;

        node.prev = prev;
        node.next = next;
    }
    
    public int get(int key) {

        if (cache.containsKey(key)) {

            Node node = cache.get(key);

            remove(node);
            insert(node);

            return node.value;
        }

        return -1;
    }

    public void put(int key, int value) {

        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }

        Node node = new Node(key, value);

        cache.put(key, node);

        insert(node);

        if (cache.size() > capacity) {

            Node lru = left.next;

            remove(lru);

            cache.remove(lru.key);
        }
    }
}
