//triplet count of array elements
import java.util.Scanner;

public class TargetCount2 {
    static int PrintCount(int arr[],int target){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                for(int k = j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target)
                    count++;

                }
            }
        }
        return count;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int[]arr =new int [n];

        System.out.println("enetr array elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the Target");
        int target = sc.nextInt();
        //print count
        System.out.println("The triplet count of target element "+target+ " is "+PrintCount(arr,target));
    }
}
