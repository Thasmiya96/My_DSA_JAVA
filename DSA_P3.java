import java.util.Scanner;

public class DSA_P3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range of Array :");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter Elements of Array :");
        for(int i = 0 ; i < len ; i ++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        reverseArray(arr);
        for(int i = 0 ; i < len ; i++){
            System.out.print(arr[i]+" ");
        }

    }
    static void reverseArray(int[] arr){
       int first = 0;
       int last=arr.length - 1;
       while(first < last){
           
              int temp = arr[first];
              arr[first] = arr[last];
              arr[last]  = temp;
              
              last--;
              first++;
       }
    }
}