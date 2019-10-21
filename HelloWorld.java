public class HelloWorld {
    public static void main(String[] args) {
        drawTriangle(10);
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
}
