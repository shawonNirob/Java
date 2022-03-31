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
    public void heapSort(int[] heap, int heapSize){
        for(int i=heapSize; i>1; i--){
            int temp = heap[i];
            heap[i]  = heap[1];
            heap[1] = temp;

            heapSize -= 1;
            maxHeapify(heap, heapSize, 1);
        }
    }
    public void buildMaxHeap(int[] heap, int heapSize){
        for(int i =heapSize/2; i>=1; i--){
            maxHeapify(heap, heapSize, i);
        }
    }

    public static void main(String[] args) {
        int[] Heap = {0,7,19,17,3,5,12,10,1,2};
        int heapSize = Heap.length-1;

        HeapDemo heap = new HeapDemo();
        heap.print(Heap, heapSize);

        System.out.println();
        heap.buildMaxHeap(Heap, heapSize);
        heap.print(Heap, heapSize);

        heap.heapSort(Heap, heapSize);
        System.out.println();
        heap.print(Heap, heapSize);

    }
}
