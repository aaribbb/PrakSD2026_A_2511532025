package pekan4_2511532025;

public class QueueArrayDriver_2511532025 {

	public static void main(String[] args) {
		QueueArray_2511532025 queue_2025 = new QueueArray_2511532025(1000);
		queue_2025.enqueue_2025(10);
		queue_2025.enqueue_2025(20);
		queue_2025.enqueue_2025(30);
		queue_2025.enqueue_2025(40);
		System.out.println("Item di depan " + queue_2025.front_2025());
		System.out.println("Item paling belakang " + queue_2025.rear_2025());
		System.out.println("tempilan queue");
		queue_2025.display_2025();
		System.out.println();
		System.out.println(queue_2025.dequeue_2025() + " dihapus dari queue");
		System.out.println("item di depan: " + queue_2025.front_2025());
		System.out.println("item di belakang: " + queue_2025.rear_2025());
		System.out.println("tempilan queue setelah satu data dihapus");
		queue_2025.display_2025();
	}

}
