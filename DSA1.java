import java.util.Scanner;

public class DSA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=0;
        System.out.println("Enter range of array");
        if(sc.hasNextInt())
            s=sc.nextInt();
        System.out.println("Enter elements of array");
        int []arr=new int[s];
        for (int i=0;i<s;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements are ");

        for(int i=0;i<s;i++){
            System.out.println(arr[i]);
        }
        sc.close();
        System.out.println("Second Largest Element is");
        System.out.println(secLargestNo(arr));

    }
    static int secLargestNo(int [] arr){
        int largestelement=-1;
        int secondlargestelement=-1;
        if(arr.length<2)
            return -1;

                for(int i=0;i<arr.length;i++){
            
            if(arr[i]>=largestelement){
                    secondlargestelement=largestelement;
                    largestelement=arr[i];
            }
            else if (arr[i]<largestelement && arr[i]>secondlargestelement)
                secondlargestelement=arr[i];
        }
        
        return secondlargestelement;
        
    }
}
