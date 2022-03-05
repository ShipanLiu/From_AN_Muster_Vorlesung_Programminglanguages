import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 3;
        numbers[1] = 2;
        numbers[2] = 1;

        Iterator<> it = Arrays.stream(numbers).iterator();

    }
}
