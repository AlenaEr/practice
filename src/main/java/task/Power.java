package task;

public class Power {
    public int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int res = 0;
        while (n >= 1) {
            res = res * a;
            n--;
        }
        return res;
    }

    public int powe2(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
}