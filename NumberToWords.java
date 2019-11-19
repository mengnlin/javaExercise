public class NumberToWords {
    public static void main(String[] arg) {
        getDigitCount(150);
        reverse(15);
        numberToWord(13002);
    }

    private static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 1;
        while (number > 9) {
            number = number / 10;
            count++;
        }
        System.out.println(count);
        return count;
    }

    private static int reverse(int number) {
        boolean negative = false;
        if (number < 0) {
            negative = true;
        }
        int reversedNumber = 0;
        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        if (negative) {
            reversedNumber *= -1;
        }
        System.out.println(reversedNumber);
        return reversedNumber;
    }

    public static void numberToWord(int number) {
        if (number < 0) {
            System.out.println("invalid");
            return;
        }
        int digitCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        int count = 0;
        while (reversedNumber > 0) {
            int currentDigit = reversedNumber % 10;
            reversedNumber /= 10;
            count++;
            switch (currentDigit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            }
        }
        while (count < digitCount) {
            System.out.println("Zero");
            count++;
        }
    }
}