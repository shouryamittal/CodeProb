class Heap {

    int capacity;
    int size;
    int harr[];

    Heap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.harr = new int[this.capacity];
    }

    int parent(int i) {
        return ((i - 1)/2);
    }

    int left(int i) {
        return (2*i + 1);
    }

    int right(int i) {
        return (2*i + 2);
    }

    void insertInHeap(int element) {
        this.size++;
        int i = this.size - 1;
        this.harr[i] = element;

        if(i != 0 && this.harr[this.parent(i)] > this.harr[i]) {
            int temp = this.harr[i];
            this.harr[i] = this.harr[this.parent(i)];
            this.harr[this.parent(i)] = temp;
        
            i = parent(i);
        }
    }

}

class FindKthLargest extends Heap{
    
    FindKthLargest(int capacity) {
        super(capacity);
    }
    void heapify(int i) {
        int smallest = i;
        int l = this.left(i);
        int r = this.right(i);

        if(l < this.size && this.harr[l] < this.harr[i]) {
            smallest = l;
        }

        if(r < this.size && this.harr[r] < this.harr[smallest]){
            smallest = r;
         }

        if(smallest != i) {
            int temp = this.harr[i];
            this.harr[i] = this.harr[smallest];
            this.harr[smallest] = temp;

            heapify(smallest);
        }
    }
    int findKthLargest(int arr[], int k) {

        for(int ele = 0 ; ele < k; ele++) {
            insertInHeap(arr[ele]);
        }

        for(int j = k; j < arr.length; j++) {
            if(this.harr[0] < arr[j]) {
                this.harr[0] = arr[j];
                heapify(0);
            }
        }
        return this.harr[0];
    }

    void print(int arr[]) {
        for(int ele: arr){
            System.out.print(" " + ele);
        }
    }

    public static void main(String ...s) {

        int arr[] = {2,4,1,5,24};
        int k = 1;
        FindKthLargest f = new FindKthLargest(k);
        System.out.println(f.findKthLargest(arr, k));
    }
}