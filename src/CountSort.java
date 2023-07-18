import java.util.*;

public class CountSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter array size");
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }

        findCountSort(array,size);
    }
    public static void findCountSort(int array[],int size)
    {
        int count_array[]=new int[10];
        Arrays.fill(count_array,0);
        for(int i=0;i<size;i++)
        {
            count_array[array[i]]++;
        }
        for(int i=0;i<10;i++)
        {

            for(int j=0;j<count_array[i];j++)
            {
                System.out.print(i+" ");
            }
        }
    }
}
