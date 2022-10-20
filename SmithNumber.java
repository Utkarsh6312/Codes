import java.util.*; //import statement

class SmithNUmber { // class Description
    public static void main(String[] args) { // main method
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        if (isSmith(sc.nextInt())) {
            System.out.println("Smith");
        } else {
            System.out.println("Not a Smith");
        }
    }

    public static int sumOfDigits(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    public static boolean isSmith(int n) {

        int no = n, s = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (i > 9) {
                    s += sumOfDigits(i);
                } else {
                    s += i;
                }
                n /= i;
                i--;
            }

        }
        return (sumOfDigits(no) == s);
    }
} // class End