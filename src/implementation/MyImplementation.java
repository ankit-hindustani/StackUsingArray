package implementation;
import stack.Mystack;

import java.util.Random;

public class MyImplementation {
    public static void main(String[] args) {
        int MaxSizeOfStack=10;
        Mystack stack=new Mystack(MaxSizeOfStack);
        int element=stack.peek();
        element=stack.pop();
        boolean check=stack.isEmpty();
        System.out.println("size of stack(total element)= "+stack.size());
        stack.push(111);
        System.out.println("size of stack(total element)= "+stack.size());
        for(int i=0;i<100;i++)
        {
            stack.push(new Random().nextInt(100));
            System.out.println("size of stack(total element)= "+stack.size());
        }
        System.out.println("size of stack(total element)= "+stack.size());

    }
}
