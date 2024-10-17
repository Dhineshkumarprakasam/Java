//hierarchical inheritence
class a 
{
    void a(){System.out.println("i am a");}
}

class b extends a
{
    void b(){System.out.println("i am b");}
}

class c extends a
{
    void c(){System.out.println("i am c");}
}

public class t5 {
    public static void main(String[] args) {
        b obj1 = new b();
        c obj2 = new c();

        obj1.a();
        obj1.b();

        obj2.a();
        obj2.c();
    }
}
