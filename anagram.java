import java.util.*;

class anagram1 {
    public static int f = 1, c = 1;
    public static String str[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String s = sc.next();
        f = fact(s.length());
        str = new String[f];
        str[0] = s;
        System.out.println(s);
        words(sToA(s));
    }

    public static boolean isPresent(String s) {
        for (int i = 0; i < str.length; i++) {
            if (s.equals(str[i]))
                return true;
        }
        return false;
    }
    public static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
    public static String shuffle(String a[]) {
        int pos;
        String temp;
        for (int i = a.length - 1; i >= 1; i--) {
            pos = (int) (Math.random() * a.length);
            temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
        }
        return aToS(a);
    }

    public static String aToS(String a[]) {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }
    public static String[] sToA(String s) {
        String a[] = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i) + "";
        }
        return a;
    }
    public static void words(String a[]) {
        String s;
        do {
            s = shuffle(a);
        } while (isPresent(s));
        str[c++] = s;
        System.out.println(s);
        f--;
        if (f != 1)
            words(sToA(shuffle(sToA(s))));
    }
}