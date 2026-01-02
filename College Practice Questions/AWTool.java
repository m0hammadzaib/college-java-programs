import java.awt.*;

public class AWTool {
    public static void main(String[] args) {
        Frame f = new Frame("Welcome Window");
        Label label = new Label("Welcome to Java AWT!");
        label.setBounds(60, 80, 200, 30);

        f.add(label);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}

