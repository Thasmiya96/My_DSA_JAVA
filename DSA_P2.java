   //To move all the Zeros in array to end
public class DSA_P2 {
    public static void main(String[] args) {
        //initializnig array
        int [] arr={1, 2, 0, 4, 3, 0, 5, 0};
        //calling function
        moveZeroToLast(arr);
        System.out.println("Array after Moving Zeros to Last :");
        for(int i=0 ; i < arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    // Function to move Zeros to Last 
    static void moveZeroToLast(int []arr)
    {
        //Pointer to swap elements using index
        int count=0;
        for(int i=0 ; i < arr.length ; i++){
            // Swap the elements when the element is non zero
            if(arr[i] != 0){
                // Value at i index store in temp
                int temp = arr[i];
                // count index value swap to i index
                arr[i] = arr[count];
                // temp value swap to count index
                arr[count] = temp;
                // count increment which indicates next position 
                count++;
            }
            
        }

    }
    
}
