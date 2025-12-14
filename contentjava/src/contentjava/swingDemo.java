package contentjava;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class swingDemo extends JFrame {

    public swingDemo() {

        // ---- FRAME SETTINGS ----
        setTitle("Modern Swing UI");
        setSize(500, 400);
        setLocationRelativeTo(null);  // center screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ---- GRADIENT PANEL ----
        JPanel gradientPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                GradientPaint gp = new GradientPaint(
                        0, 0, new Color(72, 219, 251),
                        0, getHeight(), new Color(29, 38, 113)
                );
                g2.setPaint(gp);
                g2.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        gradientPanel.setLayout(new GridBagLayout());
        add(gradientPanel, BorderLayout.CENTER);

        // ---- CARD PANEL ----
        JPanel card = new JPanel();
        card.setPreferredSize(new Dimension(350, 250));
        card.setBackground(Color.WHITE);
        card.setBorder(new LineBorder(Color.LIGHT_GRAY, 2, true));
        card.setLayout(new GridLayout(4, 1, 10, 10));

        // ---- TITLE ----
        JLabel title = new JLabel("Modern UI Form", SwingConstants.CENTER);
        title.setFont(new Font("Poppins", Font.BOLD, 20));
        card.add(title);

        // ---- TEXT FIELD ----
        JTextField nameField = new JTextField();
        nameField.setBorder(BorderFactory.createTitledBorder("Enter your Name"));
        card.add(nameField);

        // ---- BUTTON ----
        JButton btn = new JButton("Submit");
        btn.setBackground(new Color(52, 152, 219));
        btn.setForeground(Color.WHITE);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 16));
        btn.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Rounded button
        btn.setBorder(new RoundedBorder(15));

        btn.addActionListener(e -> {
            String name = nameField.getText();
            JOptionPane.showMessageDialog(this, "Hello, " + name + " !", "Message", JOptionPane.INFORMATION_MESSAGE);
        });

        card.add(btn);

        gradientPanel.add(card);
    }

    // ---- CUSTOM ROUNDED BORDER CLASS ----
    private static class RoundedBorder implements Border {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }

        public boolean isBorderOpaque() {
            return false;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new swingDemo().setVisible(true);
        });
    }
}