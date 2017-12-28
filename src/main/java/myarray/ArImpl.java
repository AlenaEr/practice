package myarray;

public class ArImpl implements ArrayExample2 {
    public int sum(int[] data) {
        int sum = 0;
        int i = 0;
        for (; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    public float avg(int[] data) {
        float avg = 0;
        int sum = 0;
        int i = 0;
        for (; i < data.length; i++) {
            sum += data[i];
        }
        avg = sum / data.length;
        return avg;
    }

    public int product(int[] data) {
        int prodact = 1;
        int i = 0;
        while (i < data.length) {
            prodact *= data[i];
            i++;
        }
        return prodact;
    }

    public int count(int[] data) {
        int count = 0;
        int val = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == val) {
                count++;
            }
        }
        return count;
    }

    public int subtraction(int[][] data) {
        int sub = 0;
        int i = 0;
        int j = 0;
        for (; i < data.length; i++) {
            for (; j < data[i].length; i++)
                sub -= data[i][j];
        }
        return sub;
    }
}
