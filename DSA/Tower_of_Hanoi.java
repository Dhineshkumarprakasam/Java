public class Tower_of_Hanoi
{
    public static void tower(int n,char a,char b,char c)
    {
        if(n==1)
        {
            System.out.println("Move 1 from "+a+" to "+c);
            return;
        }

        tower(n-1,a,c,b);
        System.out.println("Move "+n+" from "+a+" to "+c);
        tower(n-1,b,a,c);
    }
    public static void main(String[] args) {
        //formula for no.of steps (2^n)-1  
        tower(3,'s','a','d');
    }
}
