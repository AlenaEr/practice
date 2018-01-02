package sortalgo;

public class InsertionSort implements SortExample {

    public int[] sort(int[] data) {
        int temp;
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j] < data[j - 1]) {
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }

        }
        return data;
    }
}
