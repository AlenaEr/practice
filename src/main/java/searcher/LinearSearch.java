package searcher;

import java.io.File;
import java.util.LinkedList;

public class LinearSearch implements Searcher {

    @Override
    public int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
