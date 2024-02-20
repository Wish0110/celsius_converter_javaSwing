import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField celsiustextField;
    private JLabel celsiusLable;
    private JButton Convertbutton;
    private JLabel fahrenheitbutton;

    public CelsiusConverterGUI(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        Convertbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //grab the text from the celsiusfield
                //convert to a double
                //update the fahrenheitLable
                int tempFahr = (int)((Double.parseDouble(celsiustextField.getText()))
                        *1.8 + 32);
                fahrenheitbutton.setText(tempFahr + "Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new CelsiusConverterGUI("My Celsius Converter");
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
