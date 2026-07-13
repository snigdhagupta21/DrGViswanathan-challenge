class myQueue {

    int[] arr;
    int front, rear, size;

    myQueue(int n) {
        arr = new int[n];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Insert element
    void enqueue(int x) {
        if (isFull()) {
            return;
        }
        arr[++rear] = x;
        size++;
    }

    // Remove element
    void dequeue() {
        if (isEmpty()) {
            return;
        }
        front++;
        size--;
    }

    // Front element
    int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    // Rear element
    int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }

    // Queue empty?
    boolean isEmpty() {
        return size == 0;
    }

    // Queue full?
    boolean isFull() {
        return size == arr.length;
    }
}
