//find max element in array
public class MaxElement {
    public static void main(String args[]){
        int arr[]={7,9,3,4,6};
        int max=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The max element in array is: "+max);
    }
    
}
