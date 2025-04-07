/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;
import Models.Conexion;
import Views.Login;

/**
 *
 * @author helbe
 */
public class ProyectoFinal {

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        Conexion con = new Conexion();
    }
}
