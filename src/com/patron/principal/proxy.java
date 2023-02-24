/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.patron.principal;

import com.patron.proxy.ElementoProxy;
import com.patron.proxy.IElemento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jorhak
 */
public class proxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IElemento p = new ElementoProxy();

        Map<String, String> conexion = new HashMap<>();
        conexion.put("host", "192.168.0.24");
        conexion.put("database", "mvc");
        conexion.put("user", "root");
        conexion.put("password", "perpetuaeternidad");
        conexion.put("port", "3322");

        Connection con = p.getConnection(conexion);
        String resultado = "";
        if (con != null) {
            System.out.println("Conexion atravez del proxy exitosa");

            try {
                String sql = "select* from categoria";
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery(sql);
                while (rs.next()) {
                    resultado += rs.getInt("id") + "| " + rs.getString("nombre") + "\n";

                }
                System.out.println(resultado);
            } catch (Exception e) {
                System.out.println("No se pudo cargar los datos!!!!");
            }

        } else {
            System.out.println("El proxy no dejo que se conecte. Credenciales invalidas");
        }

    }

}
