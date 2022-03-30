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

    public static void main(String[] args) {
        int[] Heap = {0,19,7,17,3,5,12,10,1,2};
        int heapSize = Heap.length-1;

        HeapDemo heap = new HeapDemo();
        int h = heap.isMaxHead(Heap, heapSize);
        System.out.println(h);
    }
}
