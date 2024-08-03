//sort array as print even number at begining followed by odd numbers

public class sortEvenAndOdd {
        public static void main(String args[]){
        
       int arr[] = {7,8,3,2,4,6};   
       int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                int temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
        System.out.println("sorted array:");
        for(int k = 0;k<arr.length;k++){
            System.out.println(arr[k]);
        } 
        }
    }
    

