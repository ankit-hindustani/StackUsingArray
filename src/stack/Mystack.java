package stack;

public class Mystack {
    private int[] data;
    private int top;
    //number of element in stack
    private int size;
    public Mystack(int sizeOfArray)
    {
        data =new int[sizeOfArray];
        top=0;
        size=0;
    }
    //insert new element
    public void push(int element)
    {
        if(!isFull())
        {
            data[top]=element;
            top++;
            size++;
        }
        else
        {
            System.out.println("stack overflow");
        }

    }
    public boolean isFull()
    {
        boolean response=false;
        if(top==data.length)
            response=true;
        return response;
    }
    //delete last entered item
    public int pop()
    {
        int response=0;
        if(!isEmpty())
        {
            top--;
            size--;
            response=data[top];
        }
        else
        {
            System.out.println("stack underflow");
        }

return  response;
        }
    //checking stack for isEmpty
    public boolean isEmpty()
    {
        boolean response=false;
        if(top==0)
        {
            response=true;
        }

        return response;
    }
    public int peek()
    {
        int response=0;
        if(!isEmpty())
        {
            response=data[top-1];

        }

        else
        {
            System.out.println("stack underflow");
        }
        return response;
    }
    //a method to get number of element of the stack
    public int size()
    {
        return size;
    }



}
