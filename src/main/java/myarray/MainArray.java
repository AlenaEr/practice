package myarray;

public class MainArray {
    public static void main(String[] args) {
        ArrayExampleImpl sum = new ArrayExampleImpl();
        int[] data = {-1,10, 5, -10, 3};
       int sum2=sum.sum(data);
        System.out.println(sum2);
    }
}
