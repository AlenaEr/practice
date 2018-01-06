package task;

public class Nod {
    public int nod(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        } else {
            return nod(b, a % b);
        }
    }


    public int nod2(int a, int b) {
        while (a != b && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }
}
