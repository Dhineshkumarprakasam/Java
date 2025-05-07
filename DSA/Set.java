import java.util.*;
public class Set {
    public static void main(String[] args) {
        
        Set<String> a = new HashSet<>(); // no order is maintained
        a.add("hello");
        a.add("python");
        a.add("java");

        Set<String> b = new LinkedHashSet<>(); // same order as inserted
        b.add("hello");
        b.add("python");
        b.add("java");

        Set<String> c = new TreeSet<>(); // sorted order
        c.add("hello");
        c.add("python");
        c.add("java");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println("Set 1 : "+set1);
        System.out.println("Set 2 : "+set2);

        Set<Integer> in = new LinkedHashSet<>(set1);
        in.addAll(set2);

        Set<Integer> un = new LinkedHashSet<>(set1);
        un.retainAll(set2);

        Set<Integer> diff = new LinkedHashSet<>(set1);
        diff.removeAll(set2);

        System.out.println("intersect : "+ in);
        System.out.println("Union : "+un);
        System.out.println("diff : "+diff);
    }
}
