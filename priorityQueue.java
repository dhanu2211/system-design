

import priorityqueue.MaxHeap;

public class priorityQueue {
    public static void main(String[] args) {
        
    MaxHeap<Integer> heap = new MaxHeap<>();

    heap.add(1);
    heap.add(100);
    heap.add(4);
    heap.add(2);
    
    while(!heap.isEmpty()){
        System.out.println(heap.pop());
    }
    }
}
