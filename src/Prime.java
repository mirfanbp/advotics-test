public class Prime {
    public static void main(String[] args) {
        printPrime(5);
        // printPrimes(2) prints 2, 3
        // printPrimes(4) prints 2, 3, 5, 7
    }

    private static void printPrime(int x) {
        int count = 0;
        // start with 2
        for (int n = 2; count < x; n++){
            boolean isPrime = true;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(n + ", ");
                count++;
            }
        }
    }
}
