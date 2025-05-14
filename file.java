import java.io.FileOutputStream;

public class file {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("test.txt");
            fout.write(65);
            fout.close();
            System.out.println("success.. by Technolamror.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
