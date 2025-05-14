import java.util.Scanner;

public class targetInteger {
    public static int[] findIndices(int[] arr, int target) {
        int n = arr.length;

        // Brute-force O(n²) solution
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j }; // Return indices
                }
            }
        }

        return new int[] { -1, -1 }; // No valid pair found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER SIZE OF ARRAY: ");
        int s = sc.nextInt();
        int arr[] = new int[s];

        for (int i = 0; i < s; i++) {
            System.out.print("ENTER ELEMENT: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("ENTER TARGET SUM: ");
        int target = sc.nextInt();

        int[] result = findIndices(arr, target);

        if (result[0] != -1) {
            System.out.println("INDICES: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("NO PAIR FOUND.");
        }

        sc.close();
    }
}
