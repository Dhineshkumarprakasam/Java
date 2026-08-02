import java.util.*;

class Main
{
    static void swap(int arr[], int fi, int si, int d)
    {
        for(int i = 0; i < d; i++)
        {
            int temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    static void leftRotateRec(int arr[], int start, int d, int n)
    {
        // No rotation needed
        if(d == 0 || d == n)
        {
            return;
        }

        // Equal blocks
        if(d == n - d)
        {
            swap(arr, start, start + d, d);
            return;
        }

        // Left block is smaller
        if(d < n - d)
        {
            swap(arr, start, start + n - d, d);

            leftRotateRec(arr, start, d, n - d);
        }

        // Right block is smaller
        else
        {
            swap(arr, start, start + d, n - d);

            leftRotateRec(arr, start + n - d, 2 * d - n, d);
        }
    }

    static void leftRotate(int arr[], int d)
    {
        int n = arr.length;

        d = d % n;

        leftRotateRec(arr, 0, d, n);
    }

    static void display(int arr[])
    {
        for(int value : arr)
        {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of left rotations: ");
        int d = sc.nextInt();

        leftRotate(arr, d);

        System.out.println("Array after rotation:");

        display(arr);
    }
}
