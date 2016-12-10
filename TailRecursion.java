public class TailRecursion {

    private static void printA(int n) {
        if (n > 0) {
            System.out.println("Vaue of A is : " + n);
            printA(n - 1);
        }
    }

    public static void main(String[] args) {
        int x = 10;
        printA(x);

    }
}
