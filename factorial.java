import java.util.Scanner;

public class factorial {

    int fact(int n) {
        if (n >= 1) {
            return n * fact(-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER:");
        int num = sc.nextInt();

        System.out.println("FACTORIAL IS:" + num);
    }
}
