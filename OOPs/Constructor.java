class data
{
    int number;
    data()
    {
        number=0;
        System.out.println("i am a default constructor");
        System.out.println("number : "+number);
        
    }

    data(int num)
    {
        System.out.println("i am a parameterized constructor");
        this.number=num;
        System.out.println("number : "+number);
    }

    data(data obj)
    {
        System.out.println("i am a copy constructor");
        number = obj.number;
        System.out.println("number : "+number);
    }
}
public class t4 {
    public static void main(String[] args) {
        data obj1 = new data();
        System.out.println();
        data obj2 = new data(100);
        System.out.println();
        data obj3 = new data(obj2);
    }
}
