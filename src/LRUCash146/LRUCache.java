package LRUCash146;

import java.util.*;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Node> cache;
    private final Node headDummy;
    private final Node tailDummy;

    static class Node {
        int key;
        int value;
        Node next, prev;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(capacity);
        this.headDummy = new Node(0, 0);
        this.tailDummy = new Node(0, 0);
        headDummy.next = tailDummy;
        tailDummy.prev = headDummy;
    }

    public int get(int key) {
        Node node = cache.get(key);
        if (node == null) return -1;

        remove(node);
        addToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = cache.get(key);

        if (node != null) { // Уже есть такой ключ
            node.value = value;
            remove(node);
            addToHead(node);
        } else { // Новый ключ
            if (cache.size() >= capacity) { // Если кеш заполнен
                Node lru = tailDummy.prev; // Получаем последний узел
                remove(lru);
                cache.remove(lru.key); // Удаляем из HashMap
            }
            node = new Node(key, value);
            addToHead(node);
            cache.put(key, node); // Добавляем в HashMap
        }
    }

    private void addToHead(Node node) {
        node.next = headDummy.next;
        node.prev = headDummy;
        headDummy.next.prev = node;
        headDummy.next = node;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}

