//count the triplet of number whose sum is equal to target

import java.util.*;

public class TargetCount1 {
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

        int count=0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        System.out.println("The count of target in array is: " + count);
        
    }
    
}

    

