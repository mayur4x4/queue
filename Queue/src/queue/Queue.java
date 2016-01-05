package queue;

import java.util.NoSuchElementException;

public class Queue {

	private int[] q;
	private int front, rear, qsize, len;

	public Queue(int size) {
		// TODO Auto-generated constructor stub
		this.q = new int[size];
		qsize = size;
        len = 0;
      
        front = -1;
        rear = -1;
	}

	public void enque(int i) {
		// TODO Auto-generated method stub
		if (rear == -1) 
        {
            front = 0;
            rear = 0;
            q[rear] = i;
        }
        else if (rear + 1 >= qsize)
        	System.out.println("queue size full");
        else if ( rear + 1 < qsize)
            q[++rear] = i;    
        len++ ;  
	}

	public int deque() {
		// TODO Auto-generated method stub
		if (isEmpty())
	           throw new NoSuchElementException("Underflow Exception");
	        else 
	        {
	            len-- ;
	            int ele = q[front];
	            if ( front == rear) 
	            {
	                front = -1;
	                rear = -1;
	            }
	            else
	                front++;                
	            return ele;
	        }        
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		 return front == -1;
	}

	public void display() {
		// TODO Auto-generated method stub
		 System.out.print("\nQueue = ");
	        if (len == 0)
	        {
	            System.out.print("Empty\n");
	            return ;
	        }
	        for (int i = front; i <= rear; i++)
	            System.out.print(q[i]+" ");
	        System.out.println();    
	}

}
