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

    public void heapSort(int[] heap, int heapSize){
        for(int i=heapSize; i>1; i--){
            int temp = heap[i];
            heap[i]  = heap[1];
            heap[1] = temp;

            heapSize -= 1;
            maxHeapify(heap, heapSize, 1);
        }
    }

    public int extractMax(int heap[], int heapSize){
        int heapMax = heap[1];

        heap[1] = heap[heapSize];
        heapSize -= 1;

        maxHeapify(heap,heapSize, 1);

        return heapMax;
    }
    public int[] insertNode(int[] heap, int heapSize, int node){
        int i,p;
        heapSize +=1;
        int newHeap[] = new int[heapSize+1];
        for(int j=1; j<heapSize; j++){
            newHeap[j] = heap[j];
        }
        newHeap[heapSize] = node;
        p = parent(heapSize);
        i = heapSize;
        while(i > 1 && newHeap[i] > newHeap[p]){
            int temp = newHeap[i];
            newHeap[i] = newHeap[p];
            newHeap[p] = temp;

            i = p;
            p = parent(i);
        }
        return newHeap;
    }

    public static void main(String[] args) {
        int[] Heap = {0,26,50,80,70,75,40,70,65,85,95};
        int heapSize = Heap.length-1;

        HeapDemo heap = new HeapDemo();
        heap.print(Heap, heapSize);

        System.out.println();
        heap.buildMaxHeap(Heap, heapSize);
        heap.print(Heap, heapSize);

        //heap.heapSort(Heap, heapSize);
        System.out.println();
        heap.print(Heap, heapSize);

        System.out.println();
        System.out.println(heap.extractMax(Heap, heapSize));

        System.out.println("After insert node in Priority Queue: ");
        int[] arr;
        arr = heap.insertNode(Heap, heapSize, 100);
        heap.print(arr, arr.length-1);
        System.out.println();
        System.out.println(heap.extractMax(arr, arr.length-1));

    }
}
