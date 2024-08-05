
public class ElementCount {
    public static void main(String[] args) {
        int arr[] = {7,3,3,3,5};
        int num =3;
        int count=0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == num){
                count++;
            }
        }
       System.out.println("The occurrence of " +num+"  is " +count );
    }
    public static void printArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
 
}
