//Question Link: LRU Cache #146 -> https://leetcode.com/problems/lru-cache/
class Node{
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key, int value){
        this.key = key;
        this.value = value;
        next = null;
        prev = null;
    }
}
class LRUCache {
    Node head;
    Node tail;
    HashMap<Integer, Node> hmap;
    int Capacity;

    public LRUCache(int capacity) {
        hmap = new HashMap<>();

        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        
        Capacity = capacity;

        head.next = tail;
        tail.prev = head;
    }
   public void deleteNode(Node curr) {
    if (curr == null) return;

    Node prevNode = curr.prev;
    Node nextNode = curr.next;

    if (prevNode != null) {
        prevNode.next = nextNode;
    }
    if (nextNode != null) {
        nextNode.prev = prevNode;
    }
}

public void insertNode(Node curr) {
    if (curr == null) return;

    Node afterNode = head.next;

    curr.next = afterNode;
    curr.prev = head;

    if (afterNode != null) {
        afterNode.prev = curr;
    }

    head.next = curr;
}
    public int get(int key) {
        // check whether key is present or not
        // if not return -1;
        if(hmap.containsKey(key)== false)
            return -1;
        else{
            int value = hmap.get(key).value;
            // here we need to maintain the order
            Node curr = hmap.get(key);
            deleteNode(curr);
            insertNode(curr);
            return value;
        }
    }
    
    public void put(int key, int value) {
        if(hmap.containsKey(key) == false && Capacity == hmap.size()){
            int lastNodeKey = tail.prev.key;
            Node lastNode = hmap.get(lastNodeKey);
            deleteNode(lastNode);
            hmap.remove(lastNodeKey);
        }
        if(hmap.containsKey(key) == true){
            deleteNode(hmap.get(key));
        }
        Node newNode = new Node(key, value);
        hmap.put(key,newNode);
        insertNode(newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
