public class Fiobnacci {
    public static void main(String[] args) {
        
        int f0=0,f1=1,f2=0;
        for(int i=0;i<10;i++)
        {
            System.out.print(f2+" ");
            f0=f1;
            f1=f2;
            f2=f0+f1;
        }
    }
}
