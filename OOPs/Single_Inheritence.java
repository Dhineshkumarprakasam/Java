//single inheritence
class a 
{
    void a(){System.out.println("i am a");}
}

class b extends a
{
    void b(){System.out.println("i am b");}
}

public class t5 {
    public static void main(String[] args) {
        b obj = new b();
        obj.a();
        obj.b();
    }
}
