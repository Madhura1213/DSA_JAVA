package Queue;

public class TestQueue {

	public static void main(String[] args) {
		
		Queue que = new Queue();
		que.isEmpty();
		
		que.enqueue(5);
		que.enqueue(6);
		que.enqueue(7);
		que.enqueue(8);
		que.enqueue(9);
		que.enqueue(10);
		
		que.isEmpty();
		que.peek();
		
		que.dequeue();
		que.dequeue();
		que.dequeue();
		que.dequeue();
		que.dequeue();
		que.dequeue();
		
		que.peek();
	}

}
