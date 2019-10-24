public class HelloWorld {
    public static void main(String[] args) {
        drawTriangle(10);
        int numbers[] = { 1, 2, 3, 4, 5 };
        getMax(numbers);
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
}
