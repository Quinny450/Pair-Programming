import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGuiApp {
    private JTextArea textArea;
    private JTextField textField;

    public SimpleGuiApp() {
        // Create the frame
        JFrame frame = new JFrame("Java Print Statements");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Create the text area for output
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Create the text field for input
        textField = new JTextField();
        frame.add(textField, BorderLayout.SOUTH);

        // Add action listener to the text field
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                textArea.append("You entered: " + input + "\n");
                textField.setText(""); // Clear the input field
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SimpleGuiApp::new);
    }
}
