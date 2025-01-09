package tatsuya0924.test;

public class Vector {

    /**
     * 二つのベクトルが等しいかを判定します。
     * @param a ベクトルa
     * @param b ベクトルb
     * @return 等しければ true
     * @throws IllegalArgumentException 引数が null の場合
     */
    public static boolean equal(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("引数は null であってはなりません。");
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * 二つのベクトルのスカラー積を計算します。
     * @param a ベクトルa
     * @param b ベクトルb
     * @return スカラー積
     * @throws IllegalArgumentException 引数が null の場合
     */
    public static int scalarMultiplication(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("引数は null であってはなりません。");
        }
        if (a.length != b.length) {
            throw new IllegalArgumentException("ベクトルの長さが一致していません。");
        }
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }
}
