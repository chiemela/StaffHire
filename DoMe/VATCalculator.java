import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * The VATCalculator class inputs an amount of money without VAT from
 * one text field and outputs the amount with VAT to the other text field.
 */
public class VATCalculator implements ActionListener {
    private JTextField withoutVATTextField;
    private JTextField withVATTextField;
    private JButton addEurosButton;
    private JButton addDollarsButton;
    private JButton clearButton;
    private JFrame frame;
    private static final double VAT_PERCENTAGE = 20.0;
    
    public JLabel lable;
    private JLabel EurosDollar;

    /**
     * The GUI is created in the constructor.
     */ 
    public VATCalculator() {
        frame = new JFrame("VAT Calculator");
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridBagLayout()); // Use GridBagLayout
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding

        lable = new JLabel("Pounds");
        gbc.gridx = 0;
        gbc.gridy = 0;
        contentPane.add(lable, gbc);

        withoutVATTextField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        contentPane.add(withoutVATTextField, gbc);

        addEurosButton = new JButton("Euros");
        gbc.gridx = 0;
        gbc.gridy = 1;
        contentPane.add(addEurosButton, gbc);
        addEurosButton.addActionListener(this);

        addDollarsButton = new JButton("Dollars");
        gbc.gridx = 1;
        gbc.gridy = 1;
        contentPane.add(addDollarsButton, gbc);
        addDollarsButton.addActionListener(this);

        clearButton = new JButton("Clear");
        gbc.gridx = 2;
        gbc.gridy = 1;
        contentPane.add(clearButton, gbc);
        clearButton.addActionListener(this);

        EurosDollar = new JLabel("Euros/Dollars");
        gbc.gridx = 0;
        gbc.gridy = 2;
        contentPane.add(EurosDollar, gbc);

        withVATTextField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        contentPane.add(withVATTextField, gbc);

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * The main method allows the program to be run without BlueJ.
     */ 
    public static void main(String[] args) {
        VATCalculator calculator = new VATCalculator();
    }

    /**
     * Find which button triggered the event and call the appropriate method.
     */
    public void actionPerformed(ActionEvent event) {
        String command = event.getActionCommand();
        if (command.equals("Add VAT")) {
            addVAT();
        }
        if (command.equals("Clear")) {
            clear();
        }
    }
    
    /**
     * Input the amount of money from the first text field.
     */ 
    public double getAmountWithoutVAT() {
        return Double.parseDouble(withoutVATTextField.getText());
    }

    /**
     * Add VAT and output to the second textfield.
     */ 
    public void addVAT() {
        double amountWithVAT = (1.0 + VAT_PERCENTAGE / 100.0) * getAmountWithoutVAT();
        withVATTextField.setText("" + amountWithVAT);
    }
    
    /**
     * Clear both textfields.
     */      
    public void clear() {
        withoutVATTextField.setText("");
        withVATTextField.setText("");
    }
}
