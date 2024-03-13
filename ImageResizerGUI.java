import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ImageResizerGUI extends JFrame {
    private JTextField originalWidthField, originalHeightField, newSizeField;
    private JButton calculateButton, clearButton;
    private JRadioButton widthRadioButton, heightRadioButton;
    private ButtonGroup resizeChoiceGroup;

    public ImageResizerGUI() {
        super("Image Resizer");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        
        originalWidthField = new JTextField(5);
        addComponentWithLabel("Original Width:", originalWidthField);
        
        originalHeightField = new JTextField(5);
        addComponentWithLabel("Original Height:", originalHeightField);
        
        newSizeField = new JTextField(5);
        addComponentWithLabel("New Size:", newSizeField);
        
        // Key Listener for newSizeField to perform calculation on pressing Enter
        newSizeField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    calculateDimensions();
                }
            }
        });
        
        widthRadioButton = new JRadioButton("Resize by Width", true);
        heightRadioButton = new JRadioButton("Resize by Height");
        resizeChoiceGroup = new ButtonGroup();
        resizeChoiceGroup.add(widthRadioButton);
        resizeChoiceGroup.add(heightRadioButton);
        add(widthRadioButton);
        add(heightRadioButton);
        
        calculateButton = new JButton("Calculate New Dimensions");
        calculateButton.addActionListener(e -> calculateDimensions());
        add(calculateButton);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> {
            originalWidthField.setText("");
            originalHeightField.setText("");
            newSizeField.setText("");
        });
        add(clearButton);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    private void addComponentWithLabel(String labelText, JTextField textField) {
        JPanel panel = new JPanel();
        panel.add(new JLabel(labelText));
        panel.add(textField);
        add(panel);
    }

    private void calculateDimensions() {
        try {
            int originalWidth = Integer.parseInt(originalWidthField.getText().trim());
            int originalHeight = Integer.parseInt(originalHeightField.getText().trim());
            int newSize = Integer.parseInt(newSizeField.getText().trim());
            boolean isWidthBased = widthRadioButton.isSelected();

            int[] newDimensions = ImageResizerLogic.calculateNewDimensions(originalWidth, originalHeight, newSize, isWidthBased);

            JOptionPane.showMessageDialog(this, "New dimensions: " + newDimensions[0] + "x" + newDimensions[1]);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers in all fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ImageResizerGUI::new);
    }
}