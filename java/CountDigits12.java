
public class CountDigits12 {

    public static int count(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        n = Math.abs(n);
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int countFor = count(256);
        System.out.println("counte in total: " + countFor);
    }
}
