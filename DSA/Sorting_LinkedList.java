import java.util.*;

public class Sorting_LinkedList
{
    public static void main(String[] args) {
        
        LinkedList<Integer> a = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        String numbers = sc.nextLine();

        String arr[] = numbers.split(" ");
        for(String i : arr)
            a.add(Integer.parseInt(i));

        //printing before sorting
        for(int i : a)
            System.out.print(i+" ");
        
        Collections.sort(a);
        System.out.println();

        //printing after sorting
        for(int i : a)
            System.out.print(i+" ");

    }
}
