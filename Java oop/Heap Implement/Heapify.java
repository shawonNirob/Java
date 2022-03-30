package dataStructure.heap;

public class HeapDemo {
    public int left(int i){
        return 2 * i;
    }
    public int right(int i){
        return 2 * i + 1;
    }
    public int parent(int i){
        return i/2;
    }

    public void print(int[] H, int heapSize){
        for(int i=1; i<=heapSize; i++){
            System.out.print(" "+H[i]);
        }
    }
    public void maxHeapify(int[] H, int heapSize, int i){
        int l, r, leargest, temp;
        l = left(i);
        r = right(i);
        if(l <= heapSize  &&  H[l] > H[i]){
            leargest = l;
        }else{
            leargest = i;
        }
        if(r <= heapSize  &&  H[r] > H[leargest]){
            leargest  = r;
        }
        if(leargest != i){
            temp = H[leargest];
            H[leargest] = H[i];
            H[i] = temp;

            maxHeapify(H, heapSize, leargest);
        }
    }

    public static void main(String[] args) {
        int[] Heap = {0,17,7,19,3,5,12,10,1,2};
        int heapSize = Heap.length-1;

        HeapDemo heap = new HeapDemo();
        heap.print(Heap, heapSize);
        System.out.println();
        heap.maxHeapify(Heap, heapSize, 1);
        heap.print(Heap, heapSize);

    }
}
