package queue;

public class Qclient {
	int qsize;
	public Qclient(int size){
		this.qsize=size;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Quemain arrque = new ArrayQue(5);
		arrque.enque(56);
		arrque.enque(55);
		arrque.enque(54);
		arrque.enque(53);
		arrque.enque(33);
		arrque.display();
		arrque.deque();
		arrque.deque();
		arrque.display();
		
		Quemain ltque = new ListQue(5);
		ltque.enque(56);
		ltque.enque(87);
		ltque.enque(88);
		ltque.enque(77);
		ltque.enque(35);
		ltque.display();
		ltque.deque();
		ltque.deque();
		ltque.display();
		
		
	}

}
