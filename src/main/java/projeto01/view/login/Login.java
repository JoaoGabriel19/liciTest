package projeto01.view.login;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login {

    public boolean login(JFrame frame) {
        JDialog jd = new JDialog(frame);
        jd.setTitle("Acesso");
        jd.setModal(true);
        GridBagLayout layout = new GridBagLayout();
        jd.setLayout(layout);

        jd.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0; 
        constraints.gridx = 0; 
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel lblUsername = new JLabel("Usuário:");
        constraints.gridy = 0;
        jd.add(lblUsername, constraints);

        JTextField username = new JTextField();
        username.setPreferredSize(new Dimension(200, 25)); 
        constraints.gridy = 1;
        jd.add(username, constraints);

        JLabel lblPassword = new JLabel("Senha:");
        constraints.gridy = 2;
        jd.add(lblPassword, constraints);

        JPasswordField password = new JPasswordField();
        password.setPreferredSize(new Dimension(200, 25)); 
        constraints.gridy = 3;
        jd.add(password, constraints);

        JPanel jpBottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton btEnter = new JButton("Entrar");
        btEnter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // doLogin();
            }
        });
        jpBottom.add(btEnter);

        JButton btCancel = new JButton("Cancelar");
        btCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jpBottom.add(btCancel);

        constraints.gridy = 4;
        constraints.weighty = 1.0; 
        jd.add(jpBottom, constraints);

        jd.setResizable(false);
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);

        return true;
    }
}
