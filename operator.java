public class operator {
    public static void main(String[] args) {
        int a = 10, b = 5;
        boolean x = true, y = false;

        System.out.println("Arithmetic Operations:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operations:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\nBitwise Operations:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));
        System.out.println("a >>> 1: " + (a >>> 1));

        System.out.println("\nLogical Operations:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        System.out.println("\nAssignment Operations:");
        int c = 20;
        System.out.println("c = " + c);
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2: " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);

        System.out.println("\nTernary Operator:");
        int min = (a < b) ? a : b;
        System.out.println("Minimum of a and b: " + min);

        System.out.println("\nIncrement & Decrement Operations:");
        int num = 10;
        System.out.println("num++: " + (num++));
        System.out.println("++num: " + (++num));
        System.out.println("num--: " + (num--));
        System.out.println("--num: " + (--num));

        System.out.println("\nInstanceof Operator:");
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}
