public class HeadRecursion {

    private static void printA(int n) {
        if (n > 0) {
            printA(n - 1);
	    System.out.println("Vaue of A is : " + n);
        }
    }

    public static void main(String[] args) {
        int x = 10;
        printA(x);

    }
}
