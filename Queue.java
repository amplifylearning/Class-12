//Made by Amplify Learning - Alok Sir
// Program for Queue
// Main function is not meant to be written in isc board exams
// write only those functions which are asked in the question

class Queue
{
    int size = 10;
    int front = -1;
    int rear = -1;
    int que[];

    public Queue()
    {
        que = new int[size];
    }

    public void insert(int x)
    {
        if(rear == size-1)
        {
            System.out.println("Queue Overflow");
        }
        else if(front==-1)
        {
            front++;
            rear++;
            que[rear] = x;
        }
        else
        {
            rear++;
            que[rear] = x;
        }
    }

    public int delete()
    {
        if(front == -1 && rear == -1)
        {
            System.out.println("Queue Underflow");
            return -9999;
        }
        else if(front==rear)
        {
            int val = que[front];
            front--;
            rear--;
            return val; //return the deleted value
        }
        else
        {
            int temp = que[front];
            front++;
            return temp;
        }
    }
    
    public void display()
    {
        if(front==-1 && rear == -1)
            System.out.println("Queue is Empty");
        else
        {
            System.out.print("\nQueue is: ");
            for(int i=front; i<=rear; i++)
            {
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }
}
