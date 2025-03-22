public class DesignHashMap706 {

    class MyHashMap {
        private LinkedList[] buckets; // Массив бакетов как поле класса
        private int size = 991;

        public class Node {
            int key;
            int value;
            Node next;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
                next = null;
            }
        }

        public class LinkedList {
            Node head;

            public LinkedList() {
                head = new Node(0, 0);
            }

            public int getget(int key) {
                Node current = head.next;
                while (current != null) {
                    if (current.key == key) {
                        return current.value;
                    }
                    current = current.next;
                }
                return -1;
            }

            public void putput(int key, int value) {
                Node current = head;
                while (current.next != null) {
                    if (current.next.key == key) {
                        current.next.value = value;
                        return;
                    }
                    current = current.next;
                }
                current.next = new Node(key, value);
            }
            public void removeremove(int key) {
                Node current = head;
                while (current.next != null) {
                    if (current.next.key == key) {
                        current.next = current.next.next; // Удаляем узел
                        return;
                    }
                    current = current.next;
                }
            }
        }

        public MyHashMap() {

            buckets = new LinkedList[size];
            for (int i = 0; i < size; i++) {
                buckets[i] = new LinkedList();
            }
        }

        private int hash(int key) {
            return key % size;
        }


        public void put(int key, int value) {
            int index = hash(key);
            buckets[index].putput(key, value);
        }

        public int get(int key) {
            int index = hash(key);
            return buckets[index].getget(key);
        }

        public void remove(int key) {
            int index = hash(key);
            buckets[index].removeremove(key);
        }
    }
}
