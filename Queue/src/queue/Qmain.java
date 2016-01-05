package queue;

import java.util.Scanner;

public class Qmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
		 
	        System.out.println("Array Queue Test\n");
	        System.out.println("Enter Size of Integer Queue ");
	        int size = scan.nextInt();
		Queue q = new Queue(size);
		
		 int ch;
		 
	        do{
	            System.out.println("\nQueue Operations");
	            System.out.println("1. insert");
	            System.out.println("2. remove");
	            System.out.println("3. display");
	            int choice = scan.nextInt();
	            switch(choice){
	            case 1:
	            	System.out.println("insert element");
	            	int i = scan.nextInt();
	            	q.enque(i);
	            	break;
	            case 2:
	            	try{
	            		q.deque();
	            	}
	            	 catch(Exception e)
	                {
	                    System.out.println("Error : " +e.getMessage());
	                }
	            	
	            case 3:
	            	System.out.println("queue");
	           
	            	q.display();
	            	break;
	            default : System.out.println("Wrong Entry \n ");
                break;
            }
                       
            System.out.println("\nDo you want to continue (Type 1) \n");
            ch = scan.nextInt();
 
        } while (ch == 0);    
	            }
	        
	        
	}

