package myarray;

public class ArrayExampleImpl implements ArrayExample2 {
    public int sum(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
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

    public float avg(int[] data) {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            count++;
        }

        return sum / count;
    }

    public int product(int[] data) {
        int product = 0;
        for (int i = 0; i < data.length; i++) {
            product *= data[i];
        }
        return product;
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


