import java.util.Arrays;
import java.util.Scanner;

public class mergerover {
    public static int[][] mergeIntervals(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] result = new int[intervals.length][2];
        int index = 0;

        result[index] = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];

            if (current[0] <= result[index][1]) {
                result[index][1] = Math.max(result[index][1], current[1]);
            } else {
                index++;
                result[index] = current;
            }
        }

        return Arrays.copyOf(result, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUMBER OF INTERVALS: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];

        for (int i = 0; i < n; i++) {
            System.out.print("ENTER INTERVAL START: ");
            intervals[i][0] = sc.nextInt();
            System.out.print("ENTER INTERVAL END: ");
            intervals[i][1] = sc.nextInt();
        }

        int[][] merged = mergeIntervals(intervals);

        System.out.println("MERGED INTERVALS: ");
        for (int[] interval : merged) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }

        sc.close();
    }
}
