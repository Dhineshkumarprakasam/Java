public class p2 {

    public static void main(String args[])
    {
        int n1=10;
        int n2=10;
        int product=0;

        int bits = Integer.toBinaryString(n1).length();

        for(int i=0;i<bits;i++)
        {
            int cb = (n1 & 0b1);
            if(cb==1)
                product+=n2;
            n1>>>=1;
            n2<<=1;
        }
        System.out.println(product);
    }
}
