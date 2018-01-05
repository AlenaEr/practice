package sortalgo;

import java.util.Arrays;

public class MainSort {
    public static void main(String[] args) {


    InsertionSort insertionSort2 = new InsertionSort();
    BubbleSort bubbleSort2=new BubbleSort();
    int[] data = {1, 3, -10, 5, 0, 0};

        System.out.println(Arrays.toString(bubbleSort2.sort(data)));
}
}
