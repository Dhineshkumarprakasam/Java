import java.util.Scanner;

class data
{
    String name;
    int age;
}

public class t1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        data obj[] = new data[3];
        for(int i=0;i<3;i++)
        {
            obj[i]=new data();
            System.out.print("Enter name : ");
            obj[i].name=in.nextLine();
            System.out.print("Enter age : ");
            obj[i].age=in.nextInt();
            in.nextLine();
            System.out.println();
        }

        System.out.println("\nPriting data : -");
        for(int i=0;i<3;i++)
        {
            System.out.println("Name : "+obj[i].name);
            System.out.println("Age : "+obj[i].age);
            System.out.println();
        }
    }

}
