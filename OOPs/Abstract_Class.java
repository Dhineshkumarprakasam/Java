abstract class a 
{
    abstract void m1();
    void m2()
    {
        System.out.println("not abstract");
    }
}

public class t6 extends a {
    void m1()
    {
        System.out.println("i am abstract");
    }
    public static void main(String[] args) {
        t6 obj = new t6();
        obj.m1();
        obj.m2();
    }
}
