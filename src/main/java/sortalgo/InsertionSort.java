package sortalgo;

public class InsertionSort implements SortExample {
    @Override
    public int[] sort(int[] data) {
        int tmp;
        for (int i = 1; i < data.length; i++) {
            for (int j = i; j > 0; j--) {
                if (data[j] < data[j - 1]) {
                    tmp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = tmp;
                }
            }
        }
        return data;
    }

}
