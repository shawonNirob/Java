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
    public int isMaxHead(int[] H, int heapSize){
        for(int i =heapSize; i>1; i--){
            int p = parent(i);

            if(H[p] < H[i]){
                return -1;
            }
        }
        return 1;
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
    public void buildMaxHeap(int[] heap, int heapSize){
        for(int i =heapSize/2; i>=1; i--){
            maxHeapify(heap, heapSize, i);
        }
    }

    public static void main(String[] args) {
        int[] Heap = {0,2,19,7,5,1,12,10,3,1};
        int heapSize = Heap.length-1;

        HeapDemo heap = new HeapDemo();
        heap.print(Heap, heapSize);
        System.out.println();

        heap.buildMaxHeap(Heap, heapSize);
        heap.print(Heap, heapSize);

    }
}
