public class SwapWithoutVariable {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        //int c ;
        a=a+b;
        a = a+b;
        b= a-b;
        a=a-b;
        System.out.println("a="+a+" "+"b= "+b);
    }
    
}
