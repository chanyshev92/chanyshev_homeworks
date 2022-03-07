package ru.pcs;

public class NumbersUtil {
    /*
    нод(18, 12) -> 6
    нод(9, 12) -> 3
    нод(64, 48) -> 16

    Предусмотреть, когда на вход "некрсивые числа", отрицательные числа -> исключения
     */
    public int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException();
        }
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}

