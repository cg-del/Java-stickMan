import javax.swing.*;

public class Main {

    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("JFrame title goes here");
        frame.setVisible(true);
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("wallhaven-yxq3r7.png");
        frame.setIconImage(image.getImage());


    }
}
