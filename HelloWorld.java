public class HelloWorld {
    public static void main(String[] args) {
        drawTriangle(10);
        int numbers[] = { 1, 2, 3, 4, 5 };
        getMax(numbers);
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);

    }

    public static void drawTriangle(int N) {
        int x = 1;
        while (x <= N) {
            int currentLevel = x;
            while (currentLevel > 0) {
                System.out.print("*");
                currentLevel--;
            }
            x++;
            System.out.println();
        }
    }

    public static int getMax(int[] numberArr) {
        int max = numberArr[0];
        for (int idx = 1; idx < numberArr.length; idx++) {
            if (max < numberArr[idx]) {
                max = numberArr[idx];
            }
        }
        System.out.println(max);
        return max;
    }

    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year < 0 || year > 9999) {
            return leapYear;
        }
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            leapYear = true;
        }
        System.out.println(leapYear);
        return leapYear;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        boolean isPlaying = true;
        int lowerTemp = 25;
        int upperTemp = 35;
        if (isSummer) {
            upperTemp = 45;
        }
        if (temp < lowerTemptemp > upperTemp) {
            isPlaying = false;
        }
        return isPlaying;
    }
}
