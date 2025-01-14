import java.util.*;

public class MinStack
{
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Stack<Integer> main = new Stack<>();
        Stack<Integer> min = new Stack<>();

        System.out.print("Enter no of operations : ");
        int n = sc.nextInt();

        String operation[] = new String[n];
        int values[] = new int[n];

        //input
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter operation "+(i+1)+" : ");
            operation[i]=sc.next();

            System.out.print("Enter value "+(i+1)+" : ");
            values[i]=sc.nextInt();
            
            System.out.println();
        }

        //performing operations on given values
        for(int i=0;i<n;i++)
        {
            if(operation[i].equals("push"))
            {
                main.push(values[i]);
                if(min.isEmpty() || min.peek()>=values[i])
                    min.push(values[i]);
                System.out.println("Pushed : "+(main.peek()));
            }

            if(operation[i].equals("pop") && !main.isEmpty())
            {
                int poped = main.peek();
                main.pop();
                if(min.peek()==poped)
                    min.pop();
                System.out.println("Poped : "+(poped));
            }

            if(operation[i].equals("getmin"))
                System.out.println("Minium : "+(min.peek()));
            
            if(operation[i].equals("peek"))
                System.out.println("Peek : "+(main.peek()));
        }
        

    }
}
