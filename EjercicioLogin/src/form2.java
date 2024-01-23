import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Scanner;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;
public class form2 extends form1{
    JPanel Pantalla;
    private JButton mostrarInformacion;
    private JTable Datos;

    public form2() {
        mostrarInformacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dbURL="jdbc:mysql://localhost:3306/correo_contraseña";
                String dbuserName="root";
                String dbpassword="Tsuki1904";
                java.sql.Connection connection=null;
                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    connection = DriverManager.getConnection(dbURL,dbuserName, dbpassword);
                    Statement statement;
                    statement=connection.createStatement();
                    java.sql.ResultSet resultset;
                    resultset=statement.executeQuery("select *from registro");

                    while (resultset.next()){
                        String nombre=resultset.getString("usuario");
                        String contra=resultset.getString("contraseña");
                        System.out.println(nombre + " ---" + contra);
                    }

                }catch (Exception exception){
                    System.out.println(exception);
                }


            }
        });
    }
}
