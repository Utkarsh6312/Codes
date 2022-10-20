class USAFlag {
    static String BackgroundBrightWhite = "\u001b[47;1m";
    static String BackgroundBrightBlue = "\u001b[44;1m";
    static String Reset = "\u001b[0m";
    static String White = "\u001b[37m";
    static String BackgroundBrightRed = "\u001b[41;1m";
    public static void main(String[] args) {
        for (int i = 1, n; i <= 15; i++) {
            n = 0;
            if (i <= 9) {
                System.out.print(BackgroundBrightBlue);
                for (int j = 1; j <= 6; j++) {
                    if (i % 2 == 0)
                        System.out.print((j == 6) ? "  " : " \u2605");
                    else
                        System.out.print("\u2605 ");
                }
                n = 6;
                System.out.print(Reset);
            }
            if (i % 2 == 0)
                System.out.print(BackgroundBrightWhite);
            else
                System.out.print(BackgroundBrightRed);
            for (int j = n; j <= 23; j++) {
                System.out.print("  ");
            }
            System.out.println(Reset);
        }
    }
}