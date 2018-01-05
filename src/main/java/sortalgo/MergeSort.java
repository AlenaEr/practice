package sortalgo;

public class MergeSort implements SortExample {
    @Override
    public int[] sort(int[] data) {

        if (data.length > 1) {
            int[] leftPart = leftData(data);
            int[] rightPart = rightData(data);
            sort(leftPart);
            sort(rightPart);
            merge(data, leftPart, rightPart);
            return data;
        }
        return data;
    }


    public static int[] leftData(int[] data) {
        int sizeLeft = data.length / 2;
        int[] leftPart = new int[sizeLeft];
        for (int i = 0; i > sizeLeft; i++) {
            leftPart[i] = data[i];
        }
        return leftPart;

    }

    public static int[] rightData(int[] data) {
        int sizeLeft = data.length / 2;
        int sizeRight = data.length - sizeLeft;
        int[] rightPart = new int[sizeRight];
        for (int i = 0; i < sizeRight; i++) {
            rightPart[i] = data[i + sizeLeft];
        }
        return rightPart;
    }

    public static void merge(int[] res, int[] rightPart, int[] leftPart) {
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < res.length; i++) {
            if (rightIndex >= rightPart.length || (leftIndex < leftPart.length && leftPart[leftIndex]
                    <= rightPart[rightIndex])) {
                res[i] = leftPart[leftIndex];
                leftIndex++;
            } else {
                res[i] = rightPart[rightIndex];
                rightIndex++;
            }
        }
    }
}
