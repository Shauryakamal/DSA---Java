package LinkedList;

import java.util.HashMap;

class LRUNode {
    int key;
    int value;
    LRUNode prev;
    LRUNode next;

    LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {
    private int capacity;
    private HashMap<Integer, LRUNode> map;
    private LRUNode head;
    private LRUNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new LRUNode(0, 0);
        tail = new LRUNode(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    private void addNode(LRUNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(LRUNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        LRUNode node = map.get(key);
        removeNode(node);
        addNode(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            LRUNode node = map.get(key);
            node.value = value;
            removeNode(node);
            addNode(node);
        } else {
            LRUNode node = new LRUNode(key, value);
            map.put(key, node);
            addNode(node);

            if (map.size() > capacity) {
                LRUNode lru = tail.prev;
                removeNode(lru);
                map.remove(lru);
            }
        }
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);

        cache.put(1, 10);
        cache.put(2, 20);

        System.out.println(cache.get(1)); // 10

        cache.put(3, 30); // Removes key 2

        System.out.println(cache.get(2)); // -1
        System.out.println(cache.get(3)); // 30

        cache.put(4, 40); // Removes key 1

        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 30
        System.out.println(cache.get(4)); // 40
    }
}
