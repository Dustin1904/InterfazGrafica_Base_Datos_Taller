import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1{
    JPanel Login;
    private JPasswordField IngresoPassword;
    private JTextField IngresoUsuario;
    private JButton Ingresar;
    private JLabel User;
    private JLabel Password;
    private JTextField TextoError;

    public form1() {
        Ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String correo="1";
                String contraseña="1";
                String user= IngresoUsuario.getText();
                String contra= new String(IngresoPassword.getPassword());
                if (user.equals(correo) && contra.equals(contraseña)){
                    JFrame frame1 = new JFrame("Pantalla Principal");
                    frame1.setContentPane(new form2().Pantalla);
                    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame1.pack();
                    frame1.setSize(500,600);
                    frame1.setVisible(true);
                    JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(Ingresar);
                    frame.dispose();


                }
                else {
                    TextoError.setText("CREDENCIALES INCORRECTAS");
                }

            }
        });
    }
}
