package Controllers;

import Models.Usuarios;
import Models.UsuariosDAO;
import Views.Login;
import Views.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginController implements ActionListener {

    private Usuarios us;
    private UsuariosDAO usDAO;
    private Login view;
    
    public LoginController(Usuarios us, UsuariosDAO usDAO, Login view) {
        this.us = us;
        this.usDAO = usDAO;
        this.view = view;
        view.btnIngresar.addActionListener(this);
        view.btnCancelar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnIngresar) {
            if (view.txtNombreUsuario.getText().equals("") || String.valueOf(view.txtContrasenaUsuario.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Hay campos de textos vacios");
            } else {
                String nombreUsuario = view.txtNombreUsuario.getText();
                String contrasena = String.valueOf(view.txtContrasenaUsuario.getPassword());
                us = usDAO.login(nombreUsuario, contrasena);
                
                if (us.getNombreUsuario() != null) {
                    Menu menu = new Menu();
                    menu.setVisible(true);
                    menu.setLocationRelativeTo(null);
                    this.view.dispose();
                    
                } else {
                    JOptionPane.showMessageDialog(view, "el usuario o la contraseña son incorretos");
                }
            }
        } else {
            if (e.getSource() == view.btnCancelar) {
                int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea sali?", "pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (pregunta == 0) {
                    System.exit(0);
                }
            }
        }
    }
    
}
