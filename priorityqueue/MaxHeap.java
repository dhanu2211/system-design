package priorityqueue;

import java.util.ArrayList;

public class MaxHeap<k extends Comparable<k>>  {
    private ArrayList<k> list ;

    public MaxHeap(){
       list = new ArrayList<>();
       list.add(null);
    }

    int parent(int idx){
        return idx/2;
    }

    int left(int idx){
        return 2*idx;
    }

    int right(int idx){
        return 2*idx+1;
    }

    void swap(int i , int j){
        k val = list.get(i);
        list.set(i , list.get(j));
        list.set(j , val);
    }

    void upheap(int idx){
        if(idx == 1) return;
        int parent = parent(idx);

        //if current value os greater than the parent then swap
        if(list.get(idx).compareTo(list.get(parent)) > 0) 
        { 
            swap(idx, parent);
            upheap(parent);
        }
    }

    void downheap(int idx){
        int curr = idx;
        int left = left(idx);
        int right = right(idx);

        if(left < list.size() && list.get(idx).compareTo(list.get(left)) < 0){
            curr = left;
        }

        if(right < list.size() && list.get(idx).compareTo(list.get(right)) < 0){
            curr = right;
        }

        if(curr == idx) return;
        swap(idx, curr);
        downheap(curr);

    }

   
    public boolean isEmpty(){
        return list.size() == 1;
    }

    public void add(k val){
        list.add(val);
        upheap(list.size()-1);
    }

    public k pop(){
        if(isEmpty()) return null;

        swap(1 , list.size()-1);

        k val = list.remove(list.size()-1);

        downheap(1);
        return val; 
    }

    public k top(){
        if(isEmpty()) return null;

        return list.get(1);
    }

}
