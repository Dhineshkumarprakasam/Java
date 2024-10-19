public class p11 {

    static class Result
    {
        int x,y,gcd;
        Result(int gcd,int x,int y)
        {
            this.gcd =gcd;
            this.x=x;
            this.y=y;
        }
    }

    public static Result extendedgcd(int a,int b)
    {
        if(b==0)
            return new Result(a, 1, 0);
        
        Result result = extendedgcd(b, a%b);
        int gcd =result.gcd;
        int x = result.y;
        int y=result.x -(a/b)*result.y;

        return new Result(gcd,x,y);
    }

    public static void main(String args[])
    {
        int a = 30, b = 20;
        Result result = extendedgcd(a, b);
        
        System.out.println("GCD: " + result.gcd);
        System.out.println("x: " + result.x);
        System.out.println("y: " + result.y);
    }
}
