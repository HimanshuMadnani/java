public class pattern1 {
    public static void main(String[] args) {
        int start = 1;
        for (int i = 4; i > 0; i--) {
            int num = start;
            for (int j = 0; j < i; j++) {
                System.out.print(num);
                num++;
            }
            start = (i == 3) ? 4 : start;
            System.out.println();
        }
    }
}
