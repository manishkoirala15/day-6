package contentjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class NumberGuessGame extends JFrame implements ActionListener {

    JTextField inputField;
    JButton guessButton;
    JLabel messageLabel;
    int randomNumber;
    int attempts;

    public NumberGuessGame() {
        // Frame settings
        setTitle("Number Guessing Game");
        setSize(400, 200);
        setLayout(new GridLayout(4, 1, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Random number generate (1-100)
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
        attempts = 0;

        // Components
        JLabel instructionLabel = new JLabel("Guess a number between 1 and 100:");
        inputField = new JTextField();
        guessButton = new JButton("Guess");
        guessButton.addActionListener(this);
        messageLabel = new JLabel("");

        // Add components
        add(instructionLabel);
        add(inputField);
        add(guessButton);
        add(messageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int userGuess = Integer.parseInt(inputField.getText());
            attempts++;

            if (userGuess < randomNumber) {
                messageLabel.setText("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                messageLabel.setText("Too high! Try again.");
            } else {
                messageLabel.setText("Congratulations! You guessed it in " + attempts + " attempts.");
                guessButton.setEnabled(false); // Game over
            }
        } catch (NumberFormatException ex) {
            messageLabel.setText("Please enter a valid number!");
        }
    }

    public static void main(String[] args) {
        new NumberGuessGame();
    }
}


