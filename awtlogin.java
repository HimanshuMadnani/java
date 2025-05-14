import java.awt.*;
import java.awt.event.*;

public class awtlogin extends Frame implements ActionListener {
    Label label1, label2, status;
    TextField textField1, textField2;
    Button loginBtn;

    public awtlogin() {
        setTitle("Login Form");
        setSize(300, 200);
        setLayout(null);
        setVisible(true);

        label1 = new Label("Username:");
        label1.setBounds(30, 50, 80, 20);
        add(label1);

        textField1 = new TextField();
        textField1.setBounds(120, 50, 130, 20);
        add(textField1);

        label2 = new Label("Password:");
        label2.setBounds(30, 90, 80, 20);
        add(label2);

        textField2 = new TextField();
        textField2.setEchoChar('*');
        textField2.setBounds(120, 90, 130, 20);
        add(textField2);

        loginBtn = new Button("Login");
        loginBtn.setBounds(100, 130, 80, 30);
        add(loginBtn);
        loginBtn.addActionListener(this);

        status = new Label("");
        status.setBounds(30, 170, 250, 20);
        add(status);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String user = textField1.getText();
        String pass = textField2.getText();

        if (user.equals("admin") && pass.equals("1234")) {
            status.setText("Login Successful!");
        } else {
            status.setText("Invalid Credentials.");
        }
    }

    public static void main(String[] args) {
        new awtlogin();
    }
}
