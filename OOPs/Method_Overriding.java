//function overriding

class data
{
    void display()
    {
        System.out.println("This is display function");
    }
}

class get extends data
{
    void display()
    {
        System.out.println("I am overrided");
    }
}

public class t3{
    public static void main(String[] args) {
        get obj = new get();
        obj.display();
    }
}
