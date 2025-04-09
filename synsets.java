import java.util.Scanner;

public class synsets {

    public static void main(String[] args) {
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Synsets entered for April:");
        int a = sc.nextInt();
        System.out.println("Synsets entered for May:");
        int m = sc.nextInt();
        System.out.println("Synsets entered for June:");
        int j = sc.nextInt();

        avg = (a + m + j) / 3;

        System.out.println("Average Synsets Entered:" + avg);
        sc.close();
    }

}
