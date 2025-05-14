import java.util.Random;

public class random {
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0;
        Random rn = new Random();
        int array[] = new int[1000];

        for (int i = 0; i < 100; i++) {

            array[i] = rn.nextInt(1000);
        }

        for (int i = 0; i < 100; i++) {
            sum = sum + array[i];

        }

        avg = sum / 100;

        System.out.println("SUM IS:" + sum);
        System.out.println("Average is:" + avg);
    }
}
