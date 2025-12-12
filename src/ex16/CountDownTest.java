package ex16;

import javax.swing.*;
import java.awt.*;

public class CountDownTest extends JFrame {
    private JLabel label1;
    private JLabel label2;

    public CountDownTest() {
        setTitle("두 개 카운트");
        setSize(400, 200);
        setLayout(new GridLayout(2, 1));

        label1 = new JLabel("A : 0", SwingConstants.CENTER);
        label2 = new JLabel("B : 0", SwingConstants.CENTER);

        label1.setFont(new Font("Serif", Font.BOLD, 40));
        label2.setFont(new Font("Serif", Font.BOLD, 40));

        add(label1);
        add(label2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // ✅ 숫자 A 스레드
        //new Thread(() -> count(label1, "A")).start();

        // ✅ 숫자 B 스레드
        //new Thread(() -> count(label2, "B")).start();
        new Thread(() -> {
            count(label1, "A");
        }).start();

        new Thread(() -> {
            count(label2, "B");
        }).start();

    }

    private void count(JLabel label, String name) {
        try {
            for (int i = 1; i <= 10; i++) {
                int n = i;

                // UI 변경은 EDT에서
                SwingUtilities.invokeLater(() ->
                        label.setText(name + " : " + n)
                );

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new CountDownTest();
    }
}
