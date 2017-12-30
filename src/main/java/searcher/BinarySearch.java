package searcher;

public class BinarySearch implements Searcher {
    @Override
    public int search(int[] data, int target) {
        if (data.length == 0) {
            return -1;
        }
        if (data.length == 1) {
            return data[0] == target ? 0 : -1;
        }

        int start = 0;
        int end = data.length - 1;
        while (end - start >= 0) {
            int middle = (end + start) / 2;
            if (data[middle] == target) {
                return middle;
            }
            if (data[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
