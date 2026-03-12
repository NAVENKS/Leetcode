class LRUCache {
    class Node {
        Node prev;
        Node next;
        int key;
        int val;

        Node(int k, int v) {
            next = null;
            prev = null;
            key = k;
            val = v;
        }
    }

    Node head = null;
    Node tail = null;
    int capacity = 0;
    HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;
        Node keynode = map.get(key);
        delete(keynode);
        add(keynode);
        return keynode.val;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            delete(node);
            add(node);
            return;
        }
        if (map.size() == capacity) {
            Node lru = tail.prev;
            delete(lru);
            map.remove(lru.key);
        }
        Node newnode = new Node(key, value);
        add(newnode);
        map.put(key, newnode);
    }

    public void add(Node n) {
        head.next.prev = n;
        n.next = head.next;
        head.next = n;
        n.prev = head;
    }

    public void delete(Node n) {
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */