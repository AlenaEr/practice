package sortalgo;

public class BubbleSort implements SortExample {
    @Override
    public int[] sort(int[] data) {
        int numNext;
        for (int i = data.length; i >= 0; i--) {
            for (int j = 0; j < data.length; j++) {
                numNext = j + 1;
                if (data[j] > data[numNext]) {
                    replace(j, numNext, data);
                }
            }
        }
        return data;
    }

    public void replace(int i, int j, int[] data) {
        int temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
