package eu.sii.pl;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class SiiFrame extends JFrame {

    private static final int FRAME_WIDTH = 800;
    private final Toolkit toolkit;

    public SiiFrame(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        toolkit = Toolkit.getDefaultToolkit();

        setDimensionAndPosition();
        buildContent();
    }

    private void setDimensionAndPosition() {
        Dimension screenSize = toolkit.getScreenSize();
        int windowWidth = new Double(screenSize.getWidth() / 2).intValue();
        int windowHeight = new Double(screenSize.getHeight() / 2).intValue();
        setMinimumSize(new Dimension(windowWidth, windowHeight));

        setLocationRelativeTo(null);
    }

    private void buildContent() {
        JPanel contentPane = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JTextField firstName = createTextField();
        JTextField lastName = createTextField();

        contentPane.add(new JLabel("First name"));
        contentPane.add(firstName);
        contentPane.add(new JLabel("Last name"));
        contentPane.add(lastName);
        contentPane.setPreferredSize(new Dimension(300, 100));

        getRootPane().setContentPane(contentPane);
    }

    private JTextField createTextField() {
        JTextField field = new JTextField();
        Dimension size = field.getSize();
        size.setSize(100, size.getHeight());

        field.setMinimumSize(size);
        return field;
    }
}
