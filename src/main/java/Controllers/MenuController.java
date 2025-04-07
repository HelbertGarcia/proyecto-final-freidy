package Controllers;

import Views.Cliente;
import Views.Empleados;
import Views.Factura;
import Views.Menu;
import Views.Productos;
import Views.Reportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author helbe
 */
public class MenuController implements MouseListener{
    private Menu menu;

    public MenuController(Menu menu) {
        this.menu = menu;
        this.menu.JPaneEmpleados.addMouseListener(this);
        this.menu.JPaneClientes.addMouseListener(this);
        this.menu.JPaneProductos.addMouseListener(this);
        this.menu.JPaneFactura.addMouseListener(this);
        this.menu.JPaneReportes.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       if (e.getSource() == menu.JPaneReportes) {
            Reportes reportes = new Reportes();
            reportes.setVisible(true);
            reportes.setLocationRelativeTo(null);
            this.menu.dispose();
        } else if (e.getSource() == menu.JPaneEmpleados) {
            Empleados empleado = new Empleados();
            empleado.setVisible(true);
            empleado.setLocationRelativeTo(null);
            this.menu.dispose();
        } else if (e.getSource() == menu.JPaneFactura) {
            Factura factura = new Factura();
            factura.setVisible(true);
            factura.setLocationRelativeTo(null);
            this.menu.dispose();
        } else if (e.getSource() == menu.JPaneProductos) {
            Productos productos = new Productos();
            productos.setVisible(true);
            productos.setLocationRelativeTo(null);
            this.menu.dispose();
        } else if (e.getSource() == menu.JPaneClientes) {
            Cliente cliente = new Cliente();
            cliente.setVisible(true);
            cliente.setLocationRelativeTo(null);
            this.menu.dispose();
        }
    }
    

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
