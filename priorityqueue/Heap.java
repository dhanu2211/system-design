package priorityqueue;

public interface Heap<k>{
    void add(k val);
    k pop();
    k top();
    boolean isEmpty();
} 
