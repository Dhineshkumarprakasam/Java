//function overloading
class data
{
    String name;
    int age;

    void get(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    void get(String name)
    {
        this.name=name;
        this.age=0;
    }

    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println();
    }
}

public class t2 {
    public static void main(String[] args) {
        data obj1 = new data();
        obj1.get("dhinesh",20);
        obj1.display();

        data obj2 = new data();
        obj2.get("hello");
        obj2.display();
    }
}
