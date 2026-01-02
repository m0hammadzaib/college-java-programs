import java.awt.*;
import java.awt.event.*;

public class AWTAdd extends Frame implements ActionListener {
    TextField t1, t2, t3;
    Button b;

    AWTAdd() {
        Label l1 = new Label("Enter first number:");
        l1.setBounds(50, 50, 120, 20);
        Label l2 = new Label("Enter second number:");
        l2.setBounds(50, 90, 130, 20);

        t1 = new TextField();
        t1.setBounds(200, 50, 100, 20);
        t2 = new TextField();
        t2.setBounds(200, 90, 100, 20);

        b = new Button("Add");
        b.setBounds(130, 130, 80, 30);
        b.addActionListener(this);

        t3 = new TextField();
        t3.setBounds(130, 180, 100, 20);
        t3.setEditable(false);

        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b);
        add(t3);

        setSize(350, 250);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        t3.setText(String.valueOf(a + b));
    }

    public static void main(String[] args) {
        new AWTAdd();
    }
}

