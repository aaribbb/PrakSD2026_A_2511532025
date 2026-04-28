package pekan4_2511532025;

public class QueueArray_2511532025 {
int front_2025, rear_2025, size_2025;
int capacity_2025;
int array_2025[];

public QueueArray_2511532025(int capacity_2025) {
	this.capacity_2025 = capacity_2025;
	front_2025 = this.size_2025 = 0;
	rear_2025 = capacity_2025 -1;
	array_2025 = new int[this.capacity_2025];
}

boolean isFull(QueueArray_2511532025 queue) {
	return (queue.size_2025 == queue.capacity_2025);
}

boolean isEmpty(QueueArray_2511532025 queue) {
	return (queue.size_2025 == 0);
}

void enqueue_2025(int item) {
	if (isFull(this))
		return; 
	this.rear_2025 = (this.rear_2025 + 1) % this.capacity_2025;
	this.array_2025[this.rear_2025] = item;
	this.size_2025 = this.size_2025 + 1;
	System.out.println(item + " enqueued to queue");
}

int dequeue_2025() {
	if (isEmpty(this))
		return Integer.MIN_VALUE;
	int item = this.array_2025[this.front_2025];
	this.front_2025 = (this.front_2025 + 1) % this.capacity_2025;
	this.size_2025 = this.size_2025 - 1;
	return item;
	}

	int front_2025() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_2025[this.front_2025];
	}
	
	int rear_2025() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		return this.array_2025[this.rear_2025];
	}
	
	//mencetak elemen antrian
	void display_2025() {
		int i_2025;
		if (front_2025 == rear_2025) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		
		//kunjungi dari belakang dan cetak
		for (i_2025 = front_2025; i_2025 < rear_2025; i_2025++) {
			System.out.printf("%d <-- ", array_2025[i_2025]);
	}
	
	return;
	
}
}