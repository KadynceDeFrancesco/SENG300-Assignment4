package assignmentFour;

public class IntQueue {
	
	private int[] data;
	private int front;
	private int rear;
	private int size;
	private int capacity;
	
	
	public IntQueue(int capacity) {
		this.capacity = capacity;
		this.data = new int[capacity];
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException("The queue is empty, therefore I cannot dequeue.");
		}
		
		int removedElement = data[front];
		front = (front + 1) % capacity;
		size--;
		
		return removedElement;
	}
	
	public void enqueue(int x) {
		if(isFull()) {
			throw new IllegalStateException("The queue is full, therefore I cannot enqueue.");
		}
		
		rear = (rear + 1) % capacity;
		data[rear] = x;
		size++;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public static void main(String[] args) {
		IntQueue intQueue = new IntQueue(5);
		
		intQueue.enqueue(1);
		intQueue.enqueue(3);
		intQueue.enqueue(7);
		
        System.out.println("Dequeued: " + intQueue.dequeue());
        System.out.println("Dequeued: " + intQueue.dequeue());

        // Enqueue more elements
        intQueue.enqueue(4);
        intQueue.enqueue(5);

        if(!intQueue.isFull()) {
        	System.out.println("The queue is not full.");
        }
        else {
        	System.out.println("The queue is full.");
        }

        
        while (!intQueue.isEmpty()) {
            System.out.println("Dequeued: " + intQueue.dequeue());
        }

        if(!intQueue.isEmpty()) {
        	System.out.println("The queue is not empty.");
        }
        else {
        	System.out.println("The queue is empty.");
        }

	}
	
	

}
