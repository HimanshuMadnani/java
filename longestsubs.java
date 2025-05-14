public class longestsubs {
    public static String findLongest(String s) {
        int n = s.length();
        boolean[] visited = new boolean[256];
        int left = 0, right = 0;
        int maxLength = 0, startIndex = 0;

        while (right < n) {
            char currentChar = s.charAt(right);

            while (visited[currentChar]) {
                visited[s.charAt(left)] = false;
                left++;
            }

            visited[currentChar] = true;
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }

            right++;
        }

        return s.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        String example = "abcabcabbbcc";
        System.out.println("Longest Unique Substring: " + findLongest(example));
    }
}
