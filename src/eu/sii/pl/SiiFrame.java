package eu.sii.pl;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 */
public class SiiFrame extends JFrame {

    private final Toolkit toolkit;

    private JLabel loginLabel;
    private JTextField login;

    private JLabel passwordLabel;
    private JPasswordField password;

    private JButton okButton;

    public SiiFrame(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        toolkit = Toolkit.getDefaultToolkit();

        setDimensionAndPosition();
        buildContent();
    }

    private void setDimensionAndPosition() {
        Dimension screenSize = toolkit.getScreenSize();
//        int windowWidth = new Double(screenSize.getWidth() / 2).intValue();
//        int windowHeight = new Double(screenSize.getHeight() / 2).intValue();
        int windowWidth = 400;
        int windowHeight = 200;
        setMinimumSize(new Dimension(windowWidth, windowHeight));

        setLocationRelativeTo(null);
    }

    private void buildContent() {
        //GridLayout layout = new GridLayout(0, 2);
        GridBagLayout layout = new GridBagLayout();

        // Create components
        loginLabel = new JLabel("Login");
        login = new JTextField();
        login.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                validateInput();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                validateInput();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                validateInput();
            }

            private void validateInput() {
                if (login.getText().length() <= 0) {
                    okButton.setEnabled(false);
                } else {
                    okButton.setEnabled(true);
                }
            }
        });
        configureField(login);

        passwordLabel = new JLabel("Password");
        password = new JPasswordField();
        configureField(password);

        okButton = new JButton("OK");
        okButton.setEnabled(false);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(SiiFrame.this, "Login Action", true);
                dialog.setLocationRelativeTo(SiiFrame.this);
                dialog.add(new Label("Hello " + login.getText()));
                dialog.setMinimumSize(new Dimension(300, 200));
                dialog.setVisible(true);
            }
        });

        // Create panel
        JPanel contentPane = new JPanel(layout);
        contentPane.setBackground(new Color(255, 255, 196));
        contentPane.setPreferredSize(new Dimension(300, 100));

        // Add components
        contentPane.add(loginLabel);
        contentPane.add(login);
        contentPane.add(passwordLabel);
        contentPane.add(password);
        contentPane.add(okButton);

        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1.0;

        c.fill = GridBagConstraints.BOTH;

        c.gridwidth = GridBagConstraints.RELATIVE;
        layout.setConstraints(loginLabel, c);
        layout.setConstraints(passwordLabel, c);

        c.gridwidth = GridBagConstraints.REMAINDER;
        c.weightx = 4.0;
        layout.setConstraints(login, c);
        layout.setConstraints(password, c);
        layout.setConstraints(okButton, c);

        getRootPane().setContentPane(contentPane);
    }

    private void configureField(Component field) {
        Dimension size = field.getSize();
        size.setSize(100, size.getHeight());

        field.setMinimumSize(size);
    }
}
