//reverse array

import java.util.Scanner;

public class ReverseArray {
   
    public static void main(String args[]){
        //int arr[]={2,5,5,7,8,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int[]arr =new int [n];

        System.out.println("enetr array elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int left = 0;
        int right=arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        //printarr
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
