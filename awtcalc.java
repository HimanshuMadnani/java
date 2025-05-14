import java.awt.*;
import java.awt.event.*;

public class awtcalc extends Frame implements ActionListener {
    TextField tf1, tf2, result;
    Button addBtn, subBtn, mulBtn, divBtn;

    public awtcalc() {
        setTitle("AWT Calculator");
        setSize(350, 250);
        setLayout(null);
        setVisible(true);

        Label l1 = new Label("First Number:");
        l1.setBounds(30, 50, 100, 20);
        add(l1);

        tf1 = new TextField();
        tf1.setBounds(140, 50, 150, 20);
        add(tf1);

        Label l2 = new Label("Second Number:");
        l2.setBounds(30, 90, 100, 20);
        add(l2);

        tf2 = new TextField();
        tf2.setBounds(140, 90, 150, 20);
        add(tf2);

        addBtn = new Button("+");
        addBtn.setBounds(30, 130, 50, 30);
        add(addBtn);
        addBtn.addActionListener(this);

        subBtn = new Button("-");
        subBtn.setBounds(90, 130, 50, 30);
        add(subBtn);
        subBtn.addActionListener(this);

        mulBtn = new Button("*");
        mulBtn.setBounds(150, 130, 50, 30);
        add(mulBtn);
        mulBtn.addActionListener(this);

        divBtn = new Button("/");
        divBtn.setBounds(210, 130, 50, 30);
        add(divBtn);
        divBtn.addActionListener(this);

        result = new TextField();
        result.setBounds(30, 180, 260, 30);
        result.setEditable(false);
        add(result);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(tf1.getText());
            double b = Double.parseDouble(tf2.getText());
            double res = 0;

            if (e.getSource() == addBtn)
                res = a + b;
            else if (e.getSource() == subBtn)
                res = a - b;
            else if (e.getSource() == mulBtn)
                res = a * b;
            else if (e.getSource() == divBtn)
                res = b != 0 ? a / b : Double.NaN;

            result.setText("Result: " + res);
        } catch (NumberFormatException ex) {
            result.setText("Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new awtcalc();
    }
}
