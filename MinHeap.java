import java.util.ArrayList;

import priorityqueue.Heap;

public class MinHeap<k extends Comparable<k>>  {

    ArrayList<k> list ;
    public MinHeap(){
        list = new ArrayList<>();
        list.add(null);
    }
    
    private int parent(int idx){
        return idx/2;
    }

    private int left(int idx) {
        return idx*2;
    }

    private int right(int idx){
        return idx*2 + 1;
    }

    private void swap(int idx1 , int idx2){
        k temp = list.get(idx1);
        list.set(idx1 , list.get(idx2));
        list.set(idx2 , temp);
    }

    private void upheap(int idx){
        if(idx == 1) return ;
        int par = parent(idx);

        if(list.get(par).compareTo(list.get(idx)) > 0){
            swap(idx, par);
            upheap(par);
        }
    }

    private void downheap(int idx){
        int curr = idx;
        int left = left(idx);
        int right = right(idx);

        if(left < list.size() && list.get(curr).compareTo(list.get(left)) >0){
            curr = left;
        }

        if(right < list.size() && list.get(curr).compareTo(list.get(right)) >0){
            curr = right;
        }

        if(curr == idx) return;
        swap(curr, idx);
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
        swap(1, list.size()-1);
        k val = list.remove(list.size()-1);
        downheap(1);
        return val;
    }
    public k top(){
        if(isEmpty()) return null;
        return list.get(1);
    }
}
