import java.util.Scanner;

public class studentMarksValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student's name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks (0-100): ");
            String input = sc.nextLine();

            int marks = Integer.parseInt(input);

            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }

            System.out.println("Student: " + name + ", Marks: " + marks);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter numeric value for marks.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        } finally {
            sc.close();
            System.out.println("Input operation completed.");
        }
    }
}
