import java.util.Scanner;
public class BiggerValue {
    static int printElement(int arr[] ,int x){
        int count=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>x){
                 count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int [n];

        System.out.println("Enter the array elements");
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //element
        System.out.println("Enter the element to search:");
        int x = sc.nextInt();

        System.out.println("The last occurrence of " + x +" is "+ printElement(arr, x));


    }
}
