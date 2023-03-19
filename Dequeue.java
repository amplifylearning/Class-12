// Program on De-Queue using an Array
//Computer Science Class 12
//Inside the Program Write only those functions which are asked in the Question

import java.util.*;
class DeQueue
{
	int que[ ];
	int lim,front,rear;

	DeQueue(int l)
	{
		lim=l;
		que = new int[lim];
		front=-1;
		rear=-1;
	}
  
	public void addRear(int x)
	{
		if(front==-1 && rear==-1)
		{
		front++;
		rear++;
		que[rear]=x;
		}

		else if(rear<lim-1)
		{
		rear++;
		que[rear]=x;
		}

		else
		System.out.println(“Overflow from rear.”);
	}

	public void addFront(int x)
	{
		if(front==0)
		{
		System.out.println(“Overflow from front.”);
		}

		else
		{
		front–;
		que[front]=x;
		}
	}

	public int removeFront()
	{
		if(front-1==rear)
		{
			front=-1;
			rear=-1;
			return -9999;
		}

		else if(front==-1 && rear==-1)
			return -9999;

		else
		{
			int temp=que[front];
			front++;
			return temp;
		}

	}

	public int removeRear()
	{
		if(front==-1 && rear==-1)
			return -9999;

		else
		{
			int temp = que[rear];
			rear–;
			return temp;
		}
	}

	public void display()
	{
		int i;
		if(front==-1 && rear==-1)
			System.out.println(“Empty queue…”);

		else
		{
			System.out.println(“The queue is…”);
			System.out.print(“FRONT : “);
			for(i=front;i<=rear;i++)
			{
				System.out.print(que[i]+” : “);
			}
			System.out.println(“REAR”);
		}
	}

  // You are not expected to write Main Function in Exam
	public static void main( )
	{
		Scanner in = new Scanner(System.in);
		System.out.println(“Enter the queue size”);
		int s=in.nextInt( );
		int t;

		Array_DeQueue obj=new Array_DeQueue(s);
		int k,ch,element;

		do
		{
			System.out.println(“1. Add Front”);
			System.out.println(“2. Add Rear”);
			System.out.println(“3. Remove Front”);
			System.out.println(“4. Remove Rear”);
			System.out.println(“5. Display”);
			System.out.println(“6. Quit”);
			System.out.println(“Enter choice ?”);
			ch=Integer.parseInt(y.readLine());

			switch(ch)
			{
			case 1:
			System.out.println(“Enter the new element to be added at front”);
			element=in.nextInt( );
			obj.addFront(element);
			break;

			case 2:
			System.out.println(“Enter the new element to be added at rear”);
			element=in.nextInt( );
			obj.addRear(element);
			break;

			case 3:
			t=obj.removeFront();
			if(t==-9999)
			System.out.println(“Underflow…”);
			else
			System.out.println(“Deleted “+t);
			break;

			case 4:
			t=obj.removeFront();
			if(t==-9999)
			System.out.println(“Underflow…”);
			else
			System.out.println(“Deleted “+t);
			break;

			case 5:
			obj.display();
			break;

			case 6:
			System.out.println(“TERMINATING PROGRAM…”);
			System.exit(0);

			default:
			System.out.println(“Wrong choice… Re enter your choice”);
			}

			System.out.println(“Press 1 to continue and any other number to terminate…”);
			k=in.nextInt( );

		} while(k==1);

		System.out.println(“TERMINATING PROGRAM….”);
		System.exit(1);
	}
}
