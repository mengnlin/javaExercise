public class DogBarking {
    public static void main(String[] arg) {
        wakeUp(false, 2);
        wakeUp(true, 1);
        wakeUp(true, 8);
        wakeUp(true, -1);
    }

    public static boolean wakeUp(boolean barking, int time) {
        boolean getUp = barking;
        if ((time > 8 && time < 22) || (time < 0 || time > 23)) {
            getUp = false;
        }
        return getUp;

    }
}