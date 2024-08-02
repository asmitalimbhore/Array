//print first repeating number in array
import java.util.Scanner;

public class FirstRepeatingNum {
    static int printNum(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
       return-1;
    }


    public static void main(String[] args) {
        //int arr[] = {2,4,4,6,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size:");
        int n = sc.nextInt();
        int[]arr =new int [n];

        System.out.println("enetr array elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The first repeating number in array is: "+printNum(arr));
    }  
}
