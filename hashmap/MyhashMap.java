import java.util.LinkedList;

class MyhashMap<k , v>{
    
    public class Node{
        k key;
        v value;
        Node(k key , v value){
            this.key = key;
            this.value = value;
        }
    }

    private int size;//number of key value pairs stored
    private int capacity = 16; //initial bucket size
    private double loadFactor = 0.75;
    private LinkedList<Node>[] buckets;

    public MyhashMap(){
        buckets = new LinkedList[capacity];
        for(int i=0; i<capacity; i++){
            buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(k key){
        return Math.abs(key.hashCode())%capacity;
    }

    //put functionality 
    public void put(k key , v value){
        int index = getBucketIndex(key);
        //fetch that bucket
        LinkedList<Node> bucket = buckets[index];
        for(Node node : bucket){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
        }

        bucket.add(new Node(key , value));
        size++;

        if((double)size/capacity > loadFactor){
            rehash();
        }
    }

    //get functionality
    public v get(k key){
        int idx = getBucketIndex(key);
        for(Node node:buckets[idx]){
            if(node.key.equals(key))
            return node.value;
        }
        return null;
    }

    //remove 
    public v remove(k key){
        int idx = getBucketIndex(key);
        LinkedList<Node> bucket = buckets[idx];
        for(Node node : bucket ){
            if(node.key.equals(key)){
                bucket.remove(key);
                size--;
                return node.value;
            }
        }
        return null;
    }

    //size
    public int size(){
        return size;
    }

    //rehash 
    private void rehash(){
        System.out.println("Rehashing ..");
        LinkedList<Node>[] oldbuckets = buckets;
        capacity *= 2;
        buckets = new LinkedList[capacity];

        for(int i=0; i<capacity; i++){
            buckets[i] = new LinkedList<>();
        }

        for(LinkedList<Node> bucket : oldbuckets){
            for(Node node : bucket){
                put(node.key , node.value);
            }
        }
    }

}