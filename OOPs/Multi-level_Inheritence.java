//multi-level inheritence
class a 
{
    void a(){System.out.println("i am a");}
}

class b extends a
{
    void b(){System.out.println("i am b");}
}

class c extends b
{
    void c(){System.out.println("i am c");}
}

public class t5 {
    public static void main(String[] args) {
        c obj = new c();
        obj.a();
        obj.b();
        obj.c();
    }
}
